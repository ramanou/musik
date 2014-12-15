package service.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Person;
import service.PersonService;
import dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	@Transactional
	public void createPerson(Person Person) {
		Integer id = personDao.lastId();

		if (id == null) {
			Person.setId(0);
		} else {
			Person.setId(id + 1);
		}
		personDao.save(Person);
	}

	@Override
	public void deletePersonByKey(int PersonKey) {
		personDao.delete(PersonKey);
	}

	@Override
	public List<Person> findAllPersons() {
		return personDao.findAll();
	}

	@Override
	@Transactional
	public List<Person> findAllPersonsWithMusics() {
		List<Person> persons = personDao.findAll();
		for (Person person : persons) {
			Hibernate.initialize(person.getMusics());
		}
		return persons;
	}

	@Override
	public Person findPersonByKey(int PersonKey) {
		return personDao.findOne(PersonKey);
	}

	@Override
	public void updatePerson(Person Person) {
		personDao.save(Person);
	}

}
