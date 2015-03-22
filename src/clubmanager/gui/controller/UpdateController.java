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


    public UpdateController(MainController controller) {
        this.controller = controller;
        this.sdf = new SimpleDateFormat("yyyy-mm-dd");

        this.mtc = new MemberTableController(this);
        this.mtc.setModel(new MemberTableModel());
    }

    public void setModel(Member model) {
        this.model = model;
    }

    public void setView(UpdateView view) {
        this.view = view;
        this.mtc.setView(this.view.memberTable);
        this.view.setController(this);
    }        
            
    public void seTableData(ArrayList<Member> lst) {
        this.mtc.setModelData(lst);
    }
    
    public String parseDateTime(long l) {
        Date d = new Date(l);
        return this.sdf.format(d);
    }
    
    public void memberSelected(Member m) {
        this.view.fillViewWithMember(m);
    }
    
    public void deleteMember() throws Exception {
        this.controller.deleteMember(this.model);
    }  
    
}
