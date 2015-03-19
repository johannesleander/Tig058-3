/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.impl;

import clubmanager.dao.access.DAO;
import clubmanager.dao.domain.Member;
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
    
        @Override
    public List<Member> getMembersFromTeam(String team) {
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

    @Override
    public List<Member> getCoachesForTeam(String team) {
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
    
    
    @Override
    public List<Member> getAllMembersSortedBySurname() {
        ArrayList<Member> members = getAllMembers();
        Collections.sort(members, new MemberSurnameComparator());
        return members;
    }


    @Override
    public void updateMember(Member m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMember(Member m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
