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
import java.util.ArrayList;
import java.util.List;


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
    /**
     * 
     */
    public void setSearchTableDataBySurname() {
        this.sc.setTableData(db.getAllMembersSortedBySurname());
    }
    
    public void setSearchTableDataById() {
        this.sc.setTableData(db.getAllMembersSortedBySurname());
    }
    
    /*
    @param team
    */
    public void setSearchTableDataCoachForTeam(String team) {
        this.sc.setTableData(db.getCoachesForTeam(team));
    }
    
    /*
    @param team
    */
    public void setSearchTableDataInfoOnTeam(String team) {
        ArrayList<Member> coaches = db.getCoachesForTeam(team);
        ArrayList<Member> players = db.getMembersFromTeam(team);
        coaches.addAll(players); 
        this.sc.setTableData(coaches);   
    }
    
    /*
    @param surname
    */
    public void setSearchTableDataSearchMemberSurname(String surname) {
        Member member = db.getMemberWithLastName(surname);
        List <Member> parents = db.getAllParentsForChildren(member.getId());
        parents.add(member);
        this.sc.setTableData((ArrayList<Member>) parents);
    }
    
    /*
    @param id
    */
    public void setSearchTableDataSearchMemberId(String id) {
        Member member = db.getMemberWithId(id);
        List <Member> parents = db.getAllParentsForChildren(id);
        parents.add(member);
        this.sc.setTableData((ArrayList<Member>) parents);
    }
    
    
    /*
    
    */
    public void setUpdateTableData() {
        this.uc.setTableData(db.getAllMembersSortedBySurname());
    }
    
    
    /*
    @param s
    @throws SQLException
    */
    public void submitTeam(String s) throws SQLException {
        db.insertTeam(s);
        this.rc.updateTeamSelectDisplay(db.getAllTeams());
    }
    
    /*
    @param m
    @throws Exception
    */
    public void submitMember(Member m) throws Exception {
        db.insertMember(m);
        this.setUpdateTableData();        
    }
    
    
    /*
    @param m
    @throws Exception
    */
    public void updateMemberRoles(Member m) throws Exception {
        db.updateMemberRole(m);
        this.setUpdateTableData();
        this.uc.redrawModel();
    }
    
    
    /*
    @param m
    @throws Exception
    */
    public void updateMemberActive(Member m) throws Exception {
        db.updateMemberActive(m);
        this.setUpdateTableData();
        this.uc.redrawModel();
    }
    
    
    /*
    @param m
    @throws Exception
    */
    public void updateMemberMail(Member m) throws Exception {
        db.updateMemberEmail(m);
        this.setUpdateTableData();
        this.uc.redrawModel();
    }
    
    
    /*
    @param m
    @throws Exception
    */
    public void deleteMember(Member m) throws Exception {
        db.deleteMember(m);
        this.setUpdateTableData();
        this.uc.setModel(new Member());
        this.uc.defaultView();
    }
    
    
    /*
    @param pid
    @param cid
    @throws Exception
    */
    public void createParentChildRelation(String pid, String cid) throws Exception {
        if (!db.doesIdExist(pid)) {
            Exception e = new Exception("Parent id does not exist", null);
            throw e;
        }
        if (!db.doesIdExist(cid)) {
            Exception e = new Exception("Child id does not exist", null);
            throw e;
        }
        Member parent = db.getMemberWithId(pid);
        Member child = db.getMemberWithId(cid);
        db.addParentChildRelation(parent, child);
    }
    
}
