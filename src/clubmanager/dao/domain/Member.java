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
    private List<Integer> roles;
    private List<String> teams;    
    private List<Member> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(long birthdate) {
        this.birthdate = birthdate;
    }

    public long getJoindate() {
        return joindate;
    }

    public void setJoindate(long joindate) {
        this.joindate = joindate;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }   
    
    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public List<Member> getChildren() {
        return children;
    }

    public void setChildren(List<Member> children) {
        this.children = children;
    }        

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", gender=" + gender + ", birthdate=" + birthdate + ", joindate=" + joindate + ", active=" + active + ", roles=" + roles + ", teams=" + teams + ", children=" + children + '}';
    }         
}
