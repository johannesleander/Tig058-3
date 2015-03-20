package clubmanager.domain.comparator;

import clubmanager.dao.domain.Member;
import java.util.Comparator;

/**
 *
 * @author phcr
 * This comparator compares the Surname of the Members, if they are equal it will compare the first name.
 */
public class MemberSurnameComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2) {
        if (m1.getSurname().equals(m2.getSurname())) {
            return m1.getName().compareTo(m2.getName());
        }
        return m1.getSurname().compareTo(m2.getSurname());
    }
    
}
