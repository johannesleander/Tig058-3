package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.UpdateView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author phcr
 */
public class UpdateController {
 
    private Member model;
    private UpdateView view;
    private final MainController controller;
    private MemberTableController mtc;
    private final SimpleDateFormat sdf;

    private int selectedRow;

    public UpdateController(MainController controller) {
        this.controller = controller;
        this.sdf = new SimpleDateFormat("yyyy-mm-dd");

        this.mtc = new MemberTableController();
        this.mtc.setUpdateController(this);
        this.mtc.setModel(new MemberTableModel());
    }
    
    /*
    @param model
    */
    public void setModel(Member model) {
        this.model = model;
    }
    
    
    /*
    @param view
    */
    public void setView(UpdateView view) {
        this.view = view;
        this.mtc.setView(this.view.memberTable);
        this.view.setController(this);
    }
    
    /*
    @param s
    */
    public void setModelEmail(String s) {
        this.model.setEmail(s);
    }
    
    
    /*
    @param a
    */
    public void setModelActive(boolean a) {
        this.model.setActive(a ? 1 : 0);        
    }
    
    
    /*
    @param role
    */
    public void toggleModelRole(int role) {
        if (this.model.getRoles().indexOf(role) == -1) {
            this.model.getRoles().add(role);
        } else {
            this.model.getRoles().remove(this.model.getRoles().indexOf(role));
        }
    }
            
    
    /*
    @param lst
    */
    public void setTableData(ArrayList<Member> lst) {
        this.mtc.setModelData(lst);
        this.mtc.model.fireTableRowsUpdated(selectedRow, selectedRow);
    }
    
    
    /*
    @param l
    */
    public String parseDateTime(long l) {
        Date d = new Date(l);
        return this.sdf.format(d);
    }
    
    
    
    public void redrawModel() {        
        this.view.fillViewWithMember(this.model);
    }
    
    public void defaultView() {
        this.view.defaultViewText();
    }
    
    
    /*
    @param m
    */
    public void memberSelected(Member m, int row) {
        this.selectedRow = row;
        this.setModel(m);
        this.view.fillViewWithMember(this.model);
    }    
    
    
    /*
    @throws Exception
    */
    public void changeMemberRoles() throws Exception {
        this.controller.updateMemberRoles(this.model);
    }
    
    
    /*
    @throws Exception
    */
    public void changeMemberActive() throws Exception {
        this.controller.updateMemberActive(this.model);
    }
    
    
    /*
    @throws Exception
    */
    public void changeMemberEmail() throws Exception {
        this.controller.updateMemberMail(this.model);
    }
    
    
    /*
    @param pid
    @param cid
    @throws Exception
    */
    public void createParentChildRelation(String pid, String cid) throws Exception {
        this.controller.createParentChildRelation(pid, cid);
    }
    
    
    public void deleteMember() throws Exception {
        if (this.model.getId().equals("") || this.model.getId() == null) {
            Exception e = new Exception("Select a member before deleting.", null);
            throw e;
        }
        this.controller.deleteMember(this.model);
    }  
    
}
