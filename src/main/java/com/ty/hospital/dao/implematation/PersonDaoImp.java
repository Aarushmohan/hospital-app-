package com.ty.hospital.dao.implematation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dao.PersonDao;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;

public class PersonDaoImp implements PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}

	@Override
	public Person getPersonById(int id) {
		return entityManager.find(Person.class, id);
	}

	@Override
	public List<Encounter> getPersonEncounterByPersonId(int pid) {
		Person person = entityManager.find(Person.class, pid);
		return person.getEncounter();
	}

	@Override
	public List<Person> getPerson() {
		Query query = entityManager.createQuery("select p from Person p");
		return query.getResultList();
	}

	@Override
	public Person updatePerson(Person person, int id) {
		Person person2 = entityManager.find(Person.class, id);
		person2.setName(person.getName());
		person2.setAge(person.getAge());
		person2.setEmail(person.getEmail());
		person2.setGender(person.getGender());
		person2.setPhone(person.getPhone());
		entityTransaction.begin();
		entityManager.merge(person2);
		entityTransaction.commit();
		return person2;

	}

	@Override
	public boolean deletePersonById(int id) {
		Person person2 = entityManager.find(Person.class, id);
		if(person2 != null)
		{
			entityTransaction.begin();
			entityManager.remove(person2);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
