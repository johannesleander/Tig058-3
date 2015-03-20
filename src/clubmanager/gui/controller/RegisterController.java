package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.view.RegisterView;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author phcr
 */
public class RegisterController {
    private final Member model;
    private final RegisterView view;
    private final MainController controller;


    public RegisterController(MainController controller) {
        this.model = new Member();
        this.view = new RegisterView();
        this.view.setController(this);
        this.controller = controller;
    }
    
    public void setModelId(String id) {
        this.model.setId(id);
    }
    
    public void setModelName(String name) {
        this.model.setName(name);
    }
    
    public void setModelSurname(String sname) {
        this.model.setSurname(sname);
    }
    
    public void setModelEmail(String mail) {
        this.model.setEmail(mail);
    }
    
    public void setModelGender(int gender) {
        this.model.setGender(gender);
    }
    
    public void setModelBirthdate(String s) {
        Date d = new Date(0);
        this.model.setBirthdate(d.getTime());
    }
    
    public void setModelJoindate(String s) {
        Date d = new Date(0);
        this.model.setJoindate(d.getTime());
    }
    
    public void setModelActive(int active) {
        this.model.setActive(active);                
    }
    
    public int isModelActive() {
        return this.model.getActive() == 1 ? 1 : 0;
    }
    
    public void toggleModelRoles(int i) {        
        if (this.model.getRoles().indexOf(i) == -1) {
            this.model.getRoles().add(i);
        } else {
            this.model.getRoles().remove(this.model.getRoles().indexOf(i));
        }
    }

    public void addModelTeam(String team) {
        this.model.getTeams().add(team);
    }
    
    public void addTeam(String s) throws SQLException, Exception {
        if (s == null || s.equals("")) {
            Exception e = new Exception("Team field must have a value!", null);                    
            throw e;
        }
        this.controller.submitTeam(s);        
    }
    
    public void submit() {
        System.out.println("Submit");
        /*try {
            this.controller.submitMember(this.model);     
        } catch (Exception e) {
            System.out.println(e);
        }*/
    }
    
    public void displayView(boolean b) {
        this.view.setVisible(b);
    }        
        
}
