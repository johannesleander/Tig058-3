package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.MemberTableView;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author phcr
 */
public class MemberTableController {
    
    private UpdateController updateController;
    private SearchController searchController;
    public MemberTableModel model;
    public MemberTableView view;
    
    public MemberTableController() {
        
    }
     /*
    @param c
    */
    public void setUpdateController(UpdateController c) {
        this.updateController = c;
        
    }
    
    /*
    @param c
    */
    public void setSearchController(SearchController c) {
        this.searchController = c;
    }
    
    /*
    @param m
    */
    public void setModel(MemberTableModel m) {
        this.model = m;
    }
    
    /*
    @param v
    */
    public void setView(MemberTableView v) {
        this.view = v;
        this.view.setController(this);
    }
    
    /*
    @param lst
    */
    public void setModelData(ArrayList<Member> lst) {
        this.model.setData(lst);
    }
    
    /*
    @param row
    */
    public void selectedRow(int row, ListSelectionEvent lse) {
        // There be dragons here....        
        if (this.searchController == null) {
            this.updateController.memberSelected(this.model.getMemberAtRow(row), row);
        } else if (this.updateController == null) {
            return;
        }        
    }    
}
