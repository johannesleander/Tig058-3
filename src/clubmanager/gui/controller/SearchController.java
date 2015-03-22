package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.SearchView;
import java.util.ArrayList;

/**
 *
 * @author phcr
 */
public class SearchController {
    
    private Member model;
    private SearchView view;
    private final MainController controller;
    private MemberTableController tableController;
    
    public SearchController(MainController controller) {
        this.controller = controller;
        
        this.tableController = new MemberTableController();
        this.tableController.setSearchController(this);
        this.tableController.setModel(new MemberTableModel());
       
    }
    
    public void setView(SearchView v) {
        this.view = v;
        this.view.setController(this);
    }
    
    public void setModel(Member model) {
        this.model = model;
    }
    
     public void updateTeamSelectDisplay(ArrayList<String> lst) {
        this.view.updateTeamSelect(lst);
    }
     
    public void setTableData(ArrayList<Member> lst) {
        this.tableController.setModelData(lst);
    }
     
     public void searchMember(String s) {
         
     }
   
}
