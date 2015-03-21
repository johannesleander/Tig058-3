package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.UpdateView;

/**
 *
 * @author phcr
 */
public class UpdateController {
 
    private Member model;
    private UpdateView view;
    private final MainController controller;
    private MemberTableController mtc;

    public UpdateController(MainController controller) {
        this.controller = controller;
        
        this.mtc = new MemberTableController(this);
        this.mtc.setModel(new MemberTableModel());
        this.mtc.setView(this.view.memberTable);
    }

    public void setModel(Member model) {
        this.model = model;
    }

    public void setView(UpdateView view) {
        this.view = view;
    }        
    
    public void memberSelected(Member m) {
        this.view.fillViewWithMember(m);
    }
    
}
