/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.domain.comparator;

import clubmanager.dao.domain.Member;
import java.util.Comparator;

/**
 *
 * @author johannes
 */

    /**    
     * Compares two members objects id.
     * @param o1
     * @param o2
     * @return 
     */
public class MemberIdComparator implements Comparator<Member> {
    
    @Override
    public int compare(Member o1, Member o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
    
}
