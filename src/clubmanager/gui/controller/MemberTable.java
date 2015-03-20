package clubmanager.gui.controller;

import clubmanager.dao.impl.DAOImpl;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author phcr
 */
public class MemberTable extends javax.swing.JTable {
    
    private final MemberTableModel tblmodel;
    private final DAOImpl db;
    
    public MemberTable(DAOImpl daodb) {
        this.db = daodb;
        this.tblmodel = new MemberTableModel();
        this.tblmodel.data = db.getAllMembers();
        this.setModel(this.tblmodel);
        ListSelectionModel csm = this.getSelectionModel();
        csm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // There be dragons here.
        final MemberTable that = this;        
        
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
