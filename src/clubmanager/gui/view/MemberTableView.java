package clubmanager.gui.view;

import clubmanager.gui.controller.MemberTableController;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author phcr
 */
public class MemberTableView extends javax.swing.JTable {
    
    private MemberTableController controller;
    
    public MemberTableView() {
        
    }
    
    public void setController(MemberTableController c) {
        this.controller = c;
        this.setModel(this.controller.model);
        addSelectionListener();
    }
    
    public void addSelectionListener() {
        ListSelectionModel csm = this.getSelectionModel();
        csm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // There be dragons here.
        final MemberTableView that = this;        
        
        csm.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    System.out.println("Selected");
                    that.controller.selectedRow(that.getSelectedRow());                    
                }
            }            
        });
    }
              
    
    
}
