package com.ty.hospital.dao.implematation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.ObservationDao;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Observation;

public class ObservationDaoImp implements ObservationDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public Observation createObservation(Observation observation, int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		observation.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		return observation;
	}

	@Override
	public Observation getObservationById(int id) {
		return entityManager.find(Observation.class, id);
	}

	@Override
	public List<Observation> getAllObservationByEncounterId(int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		return encounter.getObservation();
	}

	@Override
	public Observation updateObservation(Observation observation, int id) {
		Observation observation2 = entityManager.find(Observation.class, id);
		observation2.setDiscription(observation.getDiscription());
		observation2.setDate_time(observation.getDate_time());
		entityTransaction.begin();
		entityManager.merge(observation2);
		entityTransaction.commit();
		return observation2;	
	}

	@Override
	public boolean deleteObservation(int id) {
		Observation observation = entityManager.find(Observation.class, id);
		if(observation != null)
		{
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
