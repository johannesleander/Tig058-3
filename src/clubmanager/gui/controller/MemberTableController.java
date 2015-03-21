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
    
    private final UpdateController controller;
    public MemberTableModel model;
    public MemberTableView view;
    
    public MemberTableController(UpdateController c) {
        this.controller = c;
    }
    
    public void setModel(MemberTableModel m) {
        this.model = m;
    }
    
    public void setView(MemberTableView v) {
        this.view = v;
        this.view.setModel(this.model);
    }
    
    public void setModelData(ArrayList<Member> lst) {
        this.model.setData(lst);
    }
        
    public void selectedRow(int row) {
        this.controller.memberSelected(this.model.getMemberAtRow(row));
    }    
}
