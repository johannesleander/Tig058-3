package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.MemberTableView;
import java.util.ArrayList;

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
    
    public void setUpdateController(UpdateController c) {
        this.updateController = c;
        
    }
    public void setSearchController(SearchController c) {
        this.searchController = c;
    }
    
    public void setModel(MemberTableModel m) {
        this.model = m;
    }
    
    public void setView(MemberTableView v) {
        this.view = v;
        this.view.setController(this);
    }
    
    public void setModelData(ArrayList<Member> lst) {
        this.model.setData(lst);
    }
        
    public void selectedRow(int row) {
        this.updateController.memberSelected(this.model.getMemberAtRow(row));
    }    
}
