package ua.horobets.hw19;

import java.util.List;


public class PersonService {
    private final Dao<Person> personDao = JDBC.getInstance();

    public PersonService() {
    }

    public Person findPersonByID(long id) {
        return personDao.findByID(id)
                .orElseThrow(() -> new RuntimeException("Person with " + id + " not found"));
    }

    public List<Person> findAllPerson() {
        return personDao.findAll();
    }

    public void savePerson(Person person) {
        personDao.save(person);
    }

    public void updatePerson(Person person) {
        personDao.update(person);
    }

    public void deletePerson(Person person) {
        personDao.delete((person));
    }
}