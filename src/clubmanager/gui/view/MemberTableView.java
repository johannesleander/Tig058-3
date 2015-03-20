package clubmanager.gui.view;

import clubmanager.dao.impl.DAOImpl;
import clubmanager.gui.model.MemberTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author phcr
 */
public class MemberTableView extends javax.swing.JTable {
    
    private final MemberTableModel tblmodel;
    private final DAOImpl db;
    
    public MemberTableView(DAOImpl daodb) {
        this.db = daodb;
        this.tblmodel = new MemberTableModel();
        this.tblmodel.data = db.getAllMembers();
        this.setModel(this.tblmodel);
        ListSelectionModel csm = this.getSelectionModel();
        csm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // There be dragons here.
        final MemberTableView that = this;        
        
        csm.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    System.out.println("Selected");
                    System.out.println(that.tblmodel.getMemberAtRow(that.getSelectedRow()));
                }
            }            
        });
    }
    
    
    
}
