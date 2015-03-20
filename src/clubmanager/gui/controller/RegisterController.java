package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.view.RegisterView;
import java.util.Date;
import java.util.List;

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
        this.view = new RegisterView(this);
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
    
    public void setModelBirthdate(Date d) {
        this.model.setBirthdate(d.getTime());
    }
    
    public void setModelJoindate(Date d) {
        this.model.setJoindate(d.getTime());
    }
    
    public void setModelActive(int active) {
        this.model.setActive(active);                
    }
    
    public void setModelRoles(List<Integer> roles) {
        this.model.setRoles(roles);
    }
    
    public void setModelTeam(List<String> teams) {
        this.model.setTeams(teams);
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
