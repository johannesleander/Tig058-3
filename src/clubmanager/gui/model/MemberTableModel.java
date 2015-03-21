package clubmanager.gui.model;

import clubmanager.dao.domain.Member;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author phcr
 */
public class MemberTableModel extends AbstractTableModel implements TableModelListener {

    private final String[] columnNames = {
        "ID",
        "Name",
        "Surname",
        "Email",
        "Gender",
        "Birthdate",
        "Joindate",
        "Active",
        "Role(s)",
        "Team",
        "Children"
    };
     
    public ArrayList<Member> data;
    
    public MemberTableModel() {
        
    }
    
    public void setData(ArrayList<Member> lst) {
        this.data = lst;
    }
   
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public int getRowCount() {
        return data.size();        
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Class getColumnClass(int col) {
        return getValueAt(0, col).getClass();
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object value = "";
        Member m = data.get(row);
        switch (col) {
            case 0:
                value = m.getId();
                break;
            case 1:
                value = m.getName();
                break;
            case 2:
                value = m.getSurname();
                break;
            case 3:
                value = m.getEmail();
                break;
            case 4:
                value = m.getGender()==0 ? "Male" : "Female";
                break;
            case 5:
                value = new Date(m.getBirthdate());
                break;
            case 6:
                value = new Date(m.getJoindate());
                break;
            case 7:
                value = m.getActive() == 1;
                break;
            case 8:
                value = m.getRoles();
                break;
            case 9:
                value = m.getTeams();
                break;
            case 10:
                value = m.getChildren();
                break;
        }
        
        return value;
    }
    
    public Member getMemberAtRow(int row) {
        return this.data.get(row);
    }

    @Override
    public void tableChanged(TableModelEvent tme) {
        System.out.println("Data change");
    }
    
}
