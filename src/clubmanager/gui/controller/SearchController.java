package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.model.MemberTableModel;
import clubmanager.gui.view.SearchView;
import java.util.ArrayList;

/**
 *
 * @author phcr
 */
public class SearchController {
    
    private Member model;
    private SearchView view;
    private final MainController controller;
    private MemberTableController tableController;
    
    public SearchController(MainController controller) {
        this.controller = controller;
        
        this.tableController = new MemberTableController();
        this.tableController.setSearchController(this);
        this.tableController.setModel(new MemberTableModel());
       
    }
    /*
    * Recieves an instance of SearchView as the view to control,
    * according to MVC-standars.
    * @param v SearchView-instance 
    */
    public void setView(SearchView v) {
        this.view = v;
        this.view.setController(this);
        this.tableController.setView(this.view.memberTable);
    }
    
    /*
    * Recieves an instance of Member as the model to control,
    * according to MVC-standars.
    * @param v Member-instance 
    */
    public void setModel(Member model) {
        this.model = model;
    }
    
    /*
    * Passes an ArrayList of Teams from 
    * Maincontroller to updateTeamSelect in SearchView-
    * Used to update a JCombobox.
    * @param lst Arraylist of Teams
    */
     public void updateTeamSelectDisplay(ArrayList<String> lst) {
        this.view.updateTeamSelect(lst);
    }
    /*
     * Passes an ArrayList of Members from 
     * MainController to setModelData in MemberTableController
     * Used to update the contents of a JTable
     * @param lst ArrayList of Members
     */
    public void setTableData(ArrayList<Member> lst) {
        this.tableController.setModelData(lst);
    }
    
    /*
     * Used by SearchView to access 
     * method in MainController which sorts
     * Members by surname for JTable
     */
     public void setSearchTableDataBySurname() {
        this.controller.setSearchTableDataBySurname();
     }
        
    /*
     * Used by SearchView to access 
     * method in MainController which sorts
     * Members by Id for JTable
     */
     public void setSearchTableDataById() {
        this.controller.setSearchTableDataById();
     }    
     
    /*
     * Used by SearchView to access 
     * method in MainController which gets
     * the coach from the specified team
     * @param team name of a team
     */
     public void setSearchTableDataCoachForTeam(String team) {
         this.controller.setSearchTableDataCoachForTeam(team);
     }
     
     /*
     * Used by SearchView to access 
     * method in MainController which gets
     * complete on the specified team
     * @param team name of a team
     */
     public void setSearchTableDataInfoOnTeam(String team) {
         this.controller.setSearchTableDataInfoOnTeam(team);
     }
     
     /*
     * Used by SearchView to access 
     * method in MainController which gets
     * the Member who shares Id with the user's input
     * @param id id of a member
     */
     public void setSearchTableDataSearchMemberId(String id) {
         this.controller.setSearchTableDataSearchMemberId(id);
     }
     
     /*
     * Used by SearchView to access 
     * method in MainController which gets
     * the Member who shares surname with the user's input
     * @param surname surname of a member
     */
     public void setSearchTableDataSearchMemberSurname(String surname) {
         this.controller.setSearchTableDataSearchMemberSurname(surname);
     }
}
