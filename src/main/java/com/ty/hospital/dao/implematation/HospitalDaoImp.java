package com.ty.hospital.dao.implematation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dto.Hospital;

public class HospitalDaoImp implements com.ty.hospital.dao.HospitalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}

	public Hospital getHospitalById(int id) {
		return entityManager.find(Hospital.class, id);

	}

	public List<Hospital> getAllHospital() {
		Query query = entityManager.createQuery("select h from Hospital h");
		return query.getResultList();
	}

	public Hospital updateHospital(Hospital hospital, int id) {
		Hospital hospital2 = entityManager.find(Hospital.class, id);
		hospital2.setName(hospital.getName());
		hospital2.setGstNumber(hospital.getGstNumber());
		entityTransaction.begin();
		entityManager.merge(hospital2);
		entityTransaction.commit();
		return hospital2;
	}

	public boolean delteHospitalById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
