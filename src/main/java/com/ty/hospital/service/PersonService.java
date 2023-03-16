package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;

public interface PersonService {
	public Person savePerson(Person person);

	public Person getPersonById(int id);

	public List<Encounter> getPersonEncounterByPersonId(int pid);

	public List<Person> getPerson();

	public Person updatePerson(Person person, int id);

	public boolean deletePersonById(int id);
}
