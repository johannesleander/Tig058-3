package clubmanager.gui.controller;

import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.SearchView;
import java.util.ArrayList;

/**
 *
 * @author phcr
 */
public class SearchController {
    
    private MemberTableModel model;
    private SearchView view;
    private final MainController controller;
    
    public SearchController(MainController controller) {
        this.controller = controller;
       
    }
    
    public void setView(SearchView v) {
        this.view = v;
        this.view.setController(this);
    }
    
    public void setModel(MemberTableModel mtm) {
        this.model = mtm;
    }
    
     public void updateTeamSelectDisplay(ArrayList<String> lst) {
        this.view.updateTeamSelect(lst);
    }
     
     public void searchMember(String s) {
         
     }
   
}
