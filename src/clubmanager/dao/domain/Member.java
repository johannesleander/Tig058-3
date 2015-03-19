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
public class Member {
    
    private String id;
    private String name;
    private String surname;
    private String email;
    private int gender;
    private long birthdate;
    private long joindate;
    private int active;
    private int[] roles;
    private List<String> teams;    
    private List<Member> children;
    
}
