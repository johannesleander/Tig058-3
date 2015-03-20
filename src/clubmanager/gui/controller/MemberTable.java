package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.dao.impl.DAOImpl;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author phcr
 */
public class MemberTable extends javax.swing.JTable {
    
    private final MemberTableModel tblmodel;
    
    public MemberTable() {
        this.tblmodel = new MemberTableModel();
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
    
    public void updateData(ArrayList<Member> lst) {
        this.tblmodel.data = lst;
    }            
}
