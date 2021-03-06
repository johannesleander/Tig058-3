package clubmanager.gui.controller;

import clubmanager.dao.domain.Member;
import clubmanager.gui.view.RegisterView;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author phcr
 */
public class RegisterController {
    
    private final SimpleDateFormat sdf;
    
    private Member model;
    private RegisterView view;
    private final MainController controller;


    public RegisterController(MainController controller) {
        this.controller = controller;
        this.sdf = new SimpleDateFormat("yyyy-mm-dd");
    }
    /*
    @param v
    */
    public void setView(RegisterView v) {
        this.view = v;
        this.view.setController(this);
    }
    
    /*
    @param m
    */
    public void setModel(Member m) {
        this.model = m;
    }
    
    /*
    @param id
    */
    public void setModelId(String id) {
        this.model.setId(id);
    }
    
    /*
    @param name
    */
    public void setModelName(String name) {
        this.model.setName(name);
    }
    
    /*
    @param sname
    */
    public void setModelSurname(String sname) {
        this.model.setSurname(sname);
    }
    
    /*
    @param mail
    */
    public void setModelEmail(String mail) {
        this.model.setEmail(mail);
    }
    
    /*
    @param gender
    */
    public void setModelGender(int gender) {
        this.model.setGender(gender);
    }
    
    /*
    @param m
    @throws ParseException
    */
    public void setModelBirthdate(String s) throws ParseException {        
        Date d = sdf.parse(s);
        this.model.setBirthdate(d.getTime());
    }
    
    
    /*
    @param m
    @throws ParseException
    */
    public void setModelJoindate(String s) throws ParseException {
        Date d = sdf.parse(s);
        this.model.setJoindate(d.getTime());
    }
    
    
    /*
    @param active
    */
    public void setModelActive(int active) {
        this.model.setActive(active);                
    }
    
    
    /*
    @return 1 if active, 0 if not
    */
    public int isModelActive() {
        return this.model.getActive() == 1 ? 1 : 0;
    }
    
    /*
    @param i
    */
    public void toggleModelRoles(int i) {        
        if (this.model.getRoles().indexOf(i) == -1) {
            this.model.getRoles().add(i);
        } else {
            this.model.getRoles().remove(this.model.getRoles().indexOf(i));
        }
    }

    
    /*
    @param team
    */
    public void addModelTeam(String team) {
        this.model.getTeams().add(team);
    }
    
    
    /*
    @param team
    @throws SQLException
    @throws Exception
    */
    public void addTeam(String s) throws SQLException, Exception {
        if (s == null || s.equals("")) {
            Exception e = new Exception("Team field must have a value!", null);                    
            throw e;
        }
        this.controller.submitTeam(s);        
    }
    
    
    /*
    @throws Exception
    */
    public boolean validateModel() throws Exception {
        if (!this.model.getRoles().isEmpty()) {
            for (Integer role : this.model.getRoles()) {
                if (role == 0) {
                    if (this.model.getTeams().isEmpty()) {
                        Exception e = new Exception("A player must have a team!", null);
                        throw e;
                    }
                }            
                if (role == 2) {
                    if (this.model.getTeams().isEmpty()) {
                        Exception e = new Exception("A coach must have a team!", null);
                        throw e;
                    }
                }                                    
            }
        }
                
        return (
                (!this.model.getId().equals("") || this.model.getId() != null) &&
                (!this.model.getName().equals("") || this.model.getName() != null) &&
                (!this.model.getSurname().equals("") || this.model.getSurname() != null) &&
                (!this.model.getEmail().equals("") || this.model.getEmail() != null) &&
                (this.model.getGender() == 1 || this.model.getGender() == 0) &&
                (this.model.getBirthdate() > 0) &&
                (this.model.getJoindate() > 0)                
            );
    }
    
    
    /*
    @throws Exception
    */
    public void submit() throws Exception {
        this.controller.submitMember(this.model);
        this.view.clearForm();
    }
    
    
    /*
    @param lst
    */
    public void updateTeamSelectDisplay(ArrayList<String> lst) {
        this.view.updating = true;        
        this.view.updateTeamSelect(lst);
        this.view.updating = false;
    }
    
    /*
    @param b
    */
    public void displayView(boolean b) {
        this.view.setVisible(b);
    }        
        
}
