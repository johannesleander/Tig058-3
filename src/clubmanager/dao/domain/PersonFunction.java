/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.domain;

import java.util.List;

/**
 *
 * @author phcr
 */
public class PersonFunction extends Person {
    
    private List<String> teams;
    private int[] roles;

    public PersonFunction() {
        super();        
    }    
    
    
    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public int[] getRoles() {
        return roles;
    }

    public void setRoles(int[] roles) {
        this.roles = roles;
    }
                
}
