package clubmanager.domain.comparator;

import clubmanager.dao.domain.Member;
import java.util.Comparator;

/**
 * This comparator compares the Surname of the Members, if they are equal it will compare the first name.
 * @author phcr
 */
public class MemberSurnameComparator implements Comparator<Member> {

    /**
     * Compares two members objects surnames, if they have the same surname it compares the firstname.
     * @param m1
     * @param m2
     * @return 
     */
    @Override
    public int compare(Member m1, Member m2) {
        if (m1.getSurname().equals(m2.getSurname())) {
            return m1.getName().compareTo(m2.getName());
        }
        return m1.getSurname().compareTo(m2.getSurname());
    }
    
}
