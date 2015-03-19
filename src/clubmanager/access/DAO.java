/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanager.access;

import clubmanager.domain.FullPerson;
import clubmanager.domain.Person;
import clubmanager.domain.PersonFunction;
import java.util.List;

/**
 *
 * @author phcr
 */
public interface DAO {
   public List<Person> getAllPeople();
   public List<PersonFunction> getAllPeopleFunction();
   public List<FullPerson> getAllPeopleRelations();     
   
   public Person getPerson(String id);
   public PersonFunction getPersonFunction(String id);
   public FullPerson getFullPerson(String id);
   
   public void updatePerson(Person p);
   public void updatePersonFunction(PersonFunction p);
   public void updateFullPerson(FullPerson p);
   
   public void deletePerson(Person p);
   public void deletePersonFunction(PersonFunction p);
   public void deleteFullPerson(FullPerson p);
}
