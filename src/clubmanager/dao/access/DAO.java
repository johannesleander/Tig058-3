/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.dao.access;

import clubmanager.dao.domain.Person;
import java.util.List;

/**
 *
 * @author phcr
 */
public interface DAO {
   public List<Person> getAllPeople();
   
   public Person getPersonWithId(String id);
   public Person getPersonWithLastName(String surname);
   
   public void updatePerson(Person p);
   
   public void deletePerson(Person p);
}
