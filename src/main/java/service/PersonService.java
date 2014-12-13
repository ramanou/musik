package service;

import java.util.List;

import model.Person;

public interface PersonService {

	public void createPerson(Person Person);

	public void deletePersonByKey(int PersonKey);

	public List<Person> findAllPersons();

	public Person findPersonByKey(int PersonKey);

	public void updatePerson(Person Person);

}
