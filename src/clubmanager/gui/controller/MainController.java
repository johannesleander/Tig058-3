/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.dao.impl.DAOImpl;
import clubmanager.gui.view.MainView;
import java.sql.SQLException;


/**
 *
 * @author phcr
 * @author johannes
 */
public class MainController {
    
    private MainView view;    
    private DAOImpl db;
    
    public RegisterController rc;
    public SearchController sc;
    
    public void runApp(DAOImpl db) {
        this.rc = new RegisterController(this);
        this.sc = new SearchController(this);
        this.view = new MainView(this);
        this.db = db;
        
        this.view.setVisible(true);
        this.rc.setModel(new Member());
        this.rc.setView(this.view.registryView1);
        this.rc.updateTeamSelectDisplay(db.getAllTeams());
        //this.sc.setView(this.view.registryView1);
        this.sc.updateTeamSelectDisplay(db.getAllTeams());
    }
    
    public void submitTeam(String s) throws SQLException {
        db.insertTeam(s);
        this.rc.updateTeamSelectDisplay(db.getAllTeams());
    }
    
    public void submitMember(Member m) throws Exception {
        db.insertMember(m);
    }
    
}
