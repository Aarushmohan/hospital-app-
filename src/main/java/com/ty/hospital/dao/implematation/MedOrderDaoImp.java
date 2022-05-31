package com.ty.hospital.dao.implematation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.MedOrderDao;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.dto.Person;

public class MedOrderDaoImp implements MedOrderDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public MedOrder saveMedOrder(MedOrder medOrder, int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		medOrder.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return medOrder;
	}

	@Override
	public MedOrder getMedOrderById(int id) {
		return entityManager.find(MedOrder.class, id);
	}

	@Override
	public List<MedOrder> getMedOrderByEncounterId(int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		return encounter.getMedOrder();
	}

	@Override
	public List<MedOrder> getMedOrderByPersonId(int pid) {
		List<MedOrder> list1 = new ArrayList<MedOrder>();
		Person person = entityManager.find(Person.class, pid);
		List<Encounter> list= person.getEncounter();
		for(Encounter encounter:list) {
			list1= encounter.getMedOrder();
		}
		return list1;
	}

	@Override
	public MedOrder updateMedOrder(MedOrder medOrder,int eid) {
		MedOrder medOrder2 = entityManager.find(MedOrder.class, medOrder.getId());
		medOrder2.setItem(medOrder.getItem());
		medOrder2.setTotal(medOrder.getTotal());
		
		entityTransaction.begin();
		entityManager.merge(medOrder2);
		entityTransaction.commit();
		return medOrder2;
	}

	@Override
	public MedOrder deleteMedOrderById(int id) {
		MedOrder medOrder2 = entityManager.find(MedOrder.class, id);
		List<Item> list = medOrder2.getItem();
		for(Item item : list) {
			entityTransaction.begin();
			entityManager.remove(medOrder2);
			entityManager.remove(item);
			entityTransaction.commit();
		}
		return medOrder2;
	}

}
