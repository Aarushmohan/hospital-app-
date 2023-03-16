package com.ty.hospital.service.implementation;

import java.util.List;

import com.ty.hospital.dao.implematation.PersonDaoImp;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.PersonService;

public class PersonServiceImp implements PersonService{
	PersonDaoImp personDaoImp = new PersonDaoImp();
	@Override
	public Person savePerson(Person person) {
		return personDaoImp.savePerson(person);
	}

	@Override
	public Person getPersonById(int id) {
		return personDaoImp.getPersonById(id);
	}

	@Override
	public List<Encounter> getPersonEncounterByPersonId(int pid) {
		return personDaoImp.getPersonEncounterByPersonId(pid);
	}

	@Override
	public List<Person> getPerson() {
		return personDaoImp.getPerson();
	}

	@Override
	public Person updatePerson(Person person, int id) {
		return personDaoImp.updatePerson(person, id);
	}

	@Override
	public boolean deletePersonById(int id) {
		return personDaoImp.deletePersonById(id);
	}

}
