package com.ty.hospital.dao.implematation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.EncounterDao;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;

public class EncounterDaoImp implements EncounterDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public Encounter cretaeEncounter(int bid, int pid, Encounter encounter) {
		Person person = entityManager.find(Person.class, pid);
		Branch branch = entityManager.find(Branch.class, bid);
		encounter.setPerson(person);
		encounter.setBranch(branch);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(branch);
		entityManager.persist(encounter);
		entityTransaction.commit();
		return encounter;
	}

	@Override
	public Encounter getEncounterById(int id) {
		return entityManager.find(Encounter.class, id);
	}

	@Override
	public List<Encounter> getEncounterByBranchesId(int bid) {
		Branch branch =  entityManager.find(Branch.class, bid);
		return branch.getEncounter();
	}

	@Override
	public List<Encounter> getEncounterByPersonId(int pid) {
		Person person =  entityManager.find(Person.class, pid);
		return person.getEncounter();
	}

	@Override
	public Encounter updateEncounter(Encounter encounter, int id) {
		Encounter encounter2 = entityManager.find(Encounter.class, id);
		encounter2.setReason(encounter.getReason());
		encounter2.setAdmit_date_time(encounter.getAdmit_date_time());
		encounter2.setDischarge_date_time(encounter.getDischarge_date_time());
		encounter2.setStatus(encounter.getStatus());
		entityTransaction.begin();
		entityManager.merge(encounter2);
		entityTransaction.commit();
		return encounter2;
	}

	@Override
	public boolean deleteEncounterById(int id) {
		Encounter encounter = entityManager.find(Encounter.class, id);
		if(encounter != null)
		{
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
