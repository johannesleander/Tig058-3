/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.access;

import clubmanager.dao.domain.Member;
import java.util.ArrayList;

/**
 *
 * @author phcr
 * This interface serves for the request performed towards the persistent storage of some sort.
 * The class implementing this interface handles the persistance and retrieval of information.
 */
public interface DAO {
   public ArrayList<Member> getAllMembers();
   public ArrayList<Member> getAllMembersSortedBySurname();
   public ArrayList<Member> getMembersFromTeam(String team);
   
   public Member getMemberWithId(String id);
   public Member getMemberWithLastName(String surname);
   public ArrayList<Member> getCoachesForTeam(String team);
   
   public void updateMember(Member m);
   
   public void deleteMember(Member m);
}
