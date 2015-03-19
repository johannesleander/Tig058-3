/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.impl;

import clubmanager.dao.access.DAO;
import clubmanager.dao.domain.FullPerson;
import clubmanager.dao.domain.Person;
import clubmanager.dao.domain.PersonFunction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author phcr
 */
public class DAOImpl implements DAO {

    private final Connection connection;

    public DAOImpl(Connection c) {
        this.connection = c;
    }
    
    @Override
    public List<Person> getAllPeople() {
        List<Person> ps = new ArrayList<>();
        try {
            PreparedStatement stmnt = this.connection.prepareStatement("SELECT * FROM person");
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()) {
                ps.add(personFromRs(rs));
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return Collections.unmodifiableList(ps);
    }

    @Override
    public List<PersonFunction> getAllPeopleFunction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FullPerson> getAllPeopleRelations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person getPerson(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonFunction getPersonFunction(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FullPerson getFullPerson(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePersonFunction(PersonFunction p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateFullPerson(FullPerson p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerson(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePersonFunction(PersonFunction p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFullPerson(FullPerson p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Person personFromRs(ResultSet rs) throws SQLException {
        Person p = new Person();
        p.setId(rs.getString("id"));
        p.setName(rs.getString("name"));
        p.setSurname(rs.getString("surname"));
        p.setEmail(rs.getString("email"));
        p.setGender(rs.getInt("gender"));
        p.setBirthdate(rs.getLong("birthdate"));
        p.setJoindate(rs.getLong("joindate"));
        p.setActive(rs.getInt("active"));
        return p;
    }
    
}
