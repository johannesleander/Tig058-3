/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.dao.impl.DAOImpl;
import clubmanager.gui.model.MemberTableModel;
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
    public UpdateController uc;
    
    public void runApp(DAOImpl db) {
        this.rc = new RegisterController(this);
        this.sc = new SearchController(this);
        this.uc = new UpdateController(this);
        this.view = new MainView(this);
        this.db = db;
        
        this.rc.setModel(new Member());
        this.sc.setModel(new Member());       
        this.uc.setModel(new Member());

        this.sc.setView(this.view.searchView2);
        this.rc.setView(this.view.registryView1);
        this.uc.setView(this.view.updateView2);
        
        this.rc.updateTeamSelectDisplay(db.getAllTeams());
        this.sc.updateTeamSelectDisplay(db.getAllTeams());
        
        this.uc.setTableData(db.getAllMembersSortedBySurname());
        this.sc.setTableData(db.getAllMembersSortedBySurname());
        
        this.view.setVisible(true);
    }
    
    public void setSearchTableDataBySurname() {
        this.sc.setTableData(db.getAllMembersSortedBySurname());
    }
    
    public void setSearchTableDataById() {
        this.sc.setTableData(db.getAllMembersSortedById());
    }
    
    public void setUpdateTableData() {
        this.uc.setTableData(db.getAllMembersSortedBySurname());
    }
    
    public void submitTeam(String s) throws SQLException {
        db.insertTeam(s);
        this.rc.updateTeamSelectDisplay(db.getAllTeams());
    }
    
    public void submitMember(Member m) throws Exception {
        db.insertMember(m);
    }
    
    public void deleteMember(Member m) throws Exception {
        db.deleteMember(m);
    }
    
}
