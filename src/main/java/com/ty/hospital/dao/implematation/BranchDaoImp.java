package com.ty.hospital.dao.implematation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Hospital;

public class BranchDaoImp implements BranchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	HospitalDaoImp hospitalDaoImp = new HospitalDaoImp();

	public Branch saveBranch(Branch branch, int hid) {
		Hospital hospital = hospitalDaoImp.getHospitalById(hid);
		branch.setHospital(hospital);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return branch;
	}

	public Branch getBranchById(int id) {
		return entityManager.find(Branch.class, id);
	}

	public List<Branch> getAllBranch() {
		Query query = entityManager.createQuery("select b from Branch b");
		return query.getResultList();
	}

	public Encounter getBranchEncounters(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Branch updateBranch(Branch branch, int id) {
		Branch branch2 = entityManager.find(Branch.class, id);
		branch2.setName(branch.getName());
		branch2.setEmail(branch.getEmail());
		branch2.setPhone(branch.getPhone());
		entityTransaction.begin();
		entityManager.merge(branch2);
		entityTransaction.commit();
		return branch2;
	}

	public boolean deleteBranchById(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		if(branch != null) {
		entityTransaction.begin();
		entityManager.remove(branch);
		entityTransaction.commit();
		return true;
		}
		return false;
	}
}
