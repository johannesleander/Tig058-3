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
    
     public void updateTeamSelectDisplay(ArrayList<String> lst) {
        this.view.updateTeamSelect(lst);
    }
   
}
