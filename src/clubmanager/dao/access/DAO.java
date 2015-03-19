/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.access;

import clubmanager.dao.domain.Member;
import java.util.List;

/**
 *
 * @author phcr
 */
public interface DAO {
   public List<Member> getAllMembers();
   
   public Member getMemberWithId(String id);
   public Member getMemberWithLastName(String surname);
   
   public void updateMember(Member m);
   
   public void deleteMember(Member m);
}
