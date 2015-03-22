/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.impl;

import clubmanager.dao.access.DAO;
import clubmanager.dao.domain.Member;
import clubmanager.domain.comparator.MemberIdComparator;
import clubmanager.domain.comparator.MemberSurnameComparator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author phcr
 * This class implements the DAO interface.
 */
public class DAOImpl implements DAO {

    private final Connection connection;

    public DAOImpl(Connection c) {
        this.connection = c;
    }
    
    /**
     * 
     * @param id A member id
     * @return 
     */
    private List<Integer> getAllRolesForMember(String id) {
        ArrayList<Integer> roles = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT role FROM team_roles where pid=?");
            stmnt.setString(1, id);
            
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                roles.add(rs.getInt("role"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return roles;
    }
        
    /**
     * 
     * @param id A member id
     * @return List<String>Teams are represented as Strings
     */
    private List<String> getAllTeamsForMember(String id) {
        ArrayList<String> teams = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT team FROM team_roles WHERE team not null and pid=?");
            stmnt.setString(1, id);
            
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                teams.add(rs.getString("team"));
            }
        } catch (SQLException e ) {
            System.out.println(e);
        }        
        return teams;
    }
    
    /**
     * 
     * @param id Member id
     * @return 
     */
    private List<Member> getAllChildrenForParent(String id) {
        ArrayList<Member> children = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT cid FROM parent_child WHERE pid=?");
            stmnt.setString(1, id);
            
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                children.add(getMemberWithId(rs.getString("cid")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return children;
    }
    
    /**
     * 
     * @param id Member id
     * @return 
     */
    public List<Member> getAllParentsForChildren(String id) {
        ArrayList<Member> parents = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT pid FROM parent_child WHERE cid=?");
            stmnt.setString(1, id);
            
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                parents.add(getMemberWithId(rs.getString("pid")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return parents;
    }
    
    /**
     * 
     * @param rs A {@link ResultSet} to get all fields form.
     * @return A complete member object with all it's relations. 
     * @throws SQLException 
     */
    private Member memberFromRS(ResultSet rs) throws SQLException {
        Member m = new Member();
        m.setId(rs.getString("id"));
        m.setName(rs.getString("name"));
        m.setSurname(rs.getString("surname"));
        m.setEmail(rs.getString("email"));
        m.setGender(rs.getInt("gender"));
        m.setBirthdate(rs.getLong("birthdate"));
        m.setJoindate(rs.getLong("birthdate"));
        m.setActive(rs.getInt("active"));
        m.setRoles(getAllRolesForMember(m.getId()));
        m.setTeams(getAllTeamsForMember(m.getId()));   
        m.setChildren(getAllChildrenForParent(m.getId()));
        return m;
}
    
    /**
     * 
     * @return All the members in database.
     */
    @Override
    public ArrayList<Member> getAllMembers() {
        ArrayList<Member> ms = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT * FROM person");
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()) {
                ms.add(memberFromRS(rs));
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ms;
    }
    
    /**
     * 
     * @param id Id to look for
     * @return A complete member object
     */
    @Override
    public Member getMemberWithId(String id) {
        Member m = new Member();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT * FROM person where id= ?");
            stmnt.setString(1, id);
            ResultSet rs = stmnt.executeQuery();
            
            while (rs.next()) {
                m = memberFromRS(rs);
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }      
        return m;
    }

    /**
     * 
     * @param surname Search with surname
     * @return A complete member object
     */
    @Override
    public Member getMemberWithLastName(String surname) {
        Member m = new Member();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT * FROM person where surname=?");
            stmnt.setString(1, surname);
            ResultSet rs = stmnt.executeQuery();
            
            while (rs.next()) {
                m = memberFromRS(rs);
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }      
        return m;
    }
    
    /**
     * 
     * @param team Team to search with
     * @return All the members in the team in database.
     */
    @Override
    public ArrayList<Member> getMembersFromTeam(String team) {
        ArrayList<Member> ms = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT * FROM person WHERE id IN (SELECT pid FROM team_roles WHERE team=?)");
            stmnt.setString(1, team);
            
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                ms.add(memberFromRS(rs));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }        
        return ms;
    }
    
    /**
     * 
     * @return  All the Teams in database.
     */
    @Override
    public ArrayList<String> getAllTeams() {
        ArrayList<String> teams = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT name FROM team");
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                teams.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return teams;
    }

    /**
     * 
     * @param team Team to look for coaches
     * @return All the coaches in team.
     */
    @Override
    public ArrayList<Member> getCoachesForTeam(String team) {
        ArrayList<Member> coaches = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT * FROM person WHERE id IN (SELECT pid FROM team_roles WHERE team=? and role=2");
            stmnt.setString(1, team);
            
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()) {
                coaches.add(memberFromRS(rs));                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return coaches;
    }
    
    /**
     * Uses the {@link MemberSurnameComparator} to compare.
     * @return  A sorted List of members by surname.
     **/
    @Override
    public ArrayList<Member> getAllMembersSortedBySurname() {
        ArrayList<Member> members = getAllMembers();
        Collections.sort(members, new MemberSurnameComparator());
        return members;
    }

    /**
     * Uses the {@link MemberIdComparator} to compare.
     * @return  A sorted List of members by ID.
     **/
    @Override
    public ArrayList<Member> getAllMembersSortedById() {
       ArrayList<Member> members = getAllMembers();
        Collections.sort(members, new MemberIdComparator());
        return members;
        
    }
    

    /**
     * 
     * @param m A member object to insert. Coach must have a team set whilst parent and player does not require it.
     * @return a boolean if the operation was a success.
     * @throws Exception
     * @throws SQLException 
     */

    @Override
    public boolean insertMember(Member m) throws SQLException {
        try {
            this.connection.setAutoCommit(false);
            
            PreparedStatement stmnt = this.connection.prepareStatement("INSERT INTO person values(?,?,?,?,?,?,?,?)");
            stmnt.setString(1, m.getId());
            stmnt.setString(2, m.getName());
            stmnt.setString(3, m.getSurname());
            stmnt.setString(4, m.getEmail());
            stmnt.setInt(5, m.getGender());
            stmnt.setLong(6, m.getBirthdate());
            stmnt.setLong(7, m.getJoindate());
            stmnt.setInt(8, m.getActive());            
            stmnt.executeUpdate();
            
            for (Integer role : m.getRoles()) {                
                stmnt = this.connection.prepareStatement("INSERT INTO team_roles values (?,?,?)");
                stmnt.setString(1, m.getId());
                if (!m.getTeams().isEmpty()) {
                    stmnt.setString(2, m.getTeams().get(0));
                } else {
                    stmnt.setNull(2, java.sql.Types.NULL);
                }
                stmnt.setInt(3, role);
                stmnt.executeUpdate();
            }                         
            this.connection.commit();           
        } catch (SQLException e) {
            this.connection.rollback();
            throw e;           
        } finally {           
            this.connection.setAutoCommit(true);
        }
        return true;
    }   
        
    /**
     * 
     * @param s A team string to add to database. In the form of "XXX" example. "P93"
     * @return a bool if the operation was a success
     * @throws SQLException 
     */
    @Override
    public boolean insertTeam(String s) throws SQLException {
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmnt = this.connection.prepareStatement("INSERT INTO team values(?)");
            stmnt.setString(1, s);
            
            stmnt.executeUpdate();            
            this.connection.commit();
        } finally {
            this.connection.setAutoCommit(true);
        }
        return true;
    }
    
    /**
     * 
     * @param m Member with altered active state
     * @return A boolean if it was successful
     * @throws Exception
     * @throws SQLException 
     */
    @Override
    public boolean updateMemberActive(Member m) throws Exception, SQLException {
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmnt = this.connection.prepareStatement("UPDATE person SET active=? WHERE id=? ");
            stmnt.setInt(1, m.getActive());
            stmnt.setString(2, m.getId());
            stmnt.executeUpdate();
            this.connection.commit();           
        } catch (SQLException e) {
            this.connection.rollback();
            throw e;
        } finally {
            this.connection.setAutoCommit(false);
        }
        return true;
    }

    /**
     * 
     * @param m  A member object with altered email.
     * @return  A bool if successful or not.
     * @throws Exception
     * @throws SQLException 
     */
    @Override
    public boolean updateMemberEmail(Member m) throws Exception, SQLException {
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmnt = this.connection.prepareStatement("UPDATE person SET email=? WHERE id=? ");
            stmnt.setString(1, m.getEmail());
            stmnt.setString(2, m.getId());
            stmnt.executeUpdate();
            this.connection.commit();           
        } catch (SQLException e) {
            this.connection.rollback();
            throw e;
        } finally {
            this.connection.setAutoCommit(false);
        }
        return true;
    }

    /**
     * 
     * @param m  A member with altered roles.
     * @return  A bool if successful or not.
     * @throws Exception
     * @throws SQLException 
     */
    @Override
    public boolean updateMemberRole(Member m) throws Exception, SQLException {
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmnt = this.connection.prepareStatement("DELETE FROM team_roles WHERE pid=?");
            stmnt.setString(1, m.getId());
            stmnt.executeUpdate();
            
            for (Integer role : m.getRoles()) {
                if (role == 2) {
                    if (m.getTeams().isEmpty()) {
                        Exception ex = new Exception("Coach role requires a team!", null);
                        this.connection.rollback();
                        throw ex;
                    }
                }
                stmnt = this.connection.prepareStatement("INSERT INTO team_roles VALUES (?,?,?)");
                stmnt.setString(1, m.getId());
                if (m.getTeams().isEmpty()) {
                    stmnt.setString(2, null);
                } else {
                    stmnt.setString(2, m.getTeams().get(0));
                }
                stmnt.setInt(3, role);
                stmnt.executeUpdate();
            }            
            this.connection.commit();           
        } catch (SQLException e) {
            this.connection.rollback();
            throw e;
        } finally {
            this.connection.setAutoCommit(true);
        }
        return true;
    }

    /**
     * Delete the member from the persisted storage.
     * @param m  The member to delete.
     * @return  A bool if successful or not.
     * @throws Exception
     * @throws SQLException 
     */
    @Override
    public boolean deleteMember(Member m) throws Exception,SQLException {
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmnt = this.connection.prepareStatement("DELETE FROM person WHERE id=?");
            stmnt.setString(1, m.getId());
            stmnt.executeUpdate();
            this.connection.commit();
        } catch (SQLException e) {
            this.connection.rollback();
            throw e;
        } finally {
            this.connection.setAutoCommit(true);
        }
        return true;
    }

    /**
     * Uses the databases unique constraint on parent_child relation to prevent multiple rows of duplication.
     * @param parent
     * @param child
     * @return A bool if successful or not.
     * @throws Exception
     * @throws SQLException 
     */
    @Override
    public boolean addParentChildRelation(Member parent, Member child) throws Exception,SQLException {
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmnt = this.connection.prepareStatement("INSERT INTO parent_child VALUES (?,?)");
            stmnt.setString(1, parent.getId());
            stmnt.setString(2, child.getId());
            
            stmnt.executeUpdate();
            this.connection.commit();
        } catch (SQLException e) {
            this.connection.rollback();
            throw e;
        } finally {
            this.connection.setAutoCommit(true);
        }
        return true;
    }

    /**
     * 
     * @param id  The Id to check for.
     * @return  a bool if it exists or not.
     */
    @Override
    public boolean doesIdExist(String id) {
        try {
            PreparedStatement statement = this.connection.prepareStatement("SELECT id FROM person WHERE id=?");
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            return rs.next();            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }


}
