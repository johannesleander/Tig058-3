/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager;

import clubmanager.dao.domain.Member;
import clubmanager.dao.impl.DAOImpl;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author johannes
 * @author phcr
 */
public class ClubManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DAOImpl db = new DAOImpl(DriverManager.getConnection("jdbc:sqlite:club.db"));
            Member m = db.getMemberWithId(db.getAllMembers().get(0).getId());
            System.out.println(m.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }        
        // TODO code application logic here
    }
    
}
