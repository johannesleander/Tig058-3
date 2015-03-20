package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.view.UpdateView;

/**
 *
 * @author phcr
 */
public class UpdateController {
 
    private Member model;
    private UpdateView view;
    private final MainController controller;

    public UpdateController(MainController controller) {
        this.controller = controller;
    }

    public void setModel(Member model) {
        this.model = model;
    }

    public void setView(UpdateView view) {
        this.view = view;
    }        
    
}
