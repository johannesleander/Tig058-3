/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager;

import clubmanager.dao.impl.DAOImpl;
import clubmanager.gui.controller.MainController;
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
            MainController mc = new MainController();
            mc.runApp(db);
        } catch (SQLException e) {
            System.out.println(e);
        }    
    }
}
