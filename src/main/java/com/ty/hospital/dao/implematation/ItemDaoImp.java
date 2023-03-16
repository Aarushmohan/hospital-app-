package com.ty.hospital.dao.implematation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.ItemDao;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;

public class ItemDaoImp implements ItemDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public Item saveItem(Item item, int mid) {
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		item.setMedOrder(medOrder);
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return item;
	}

	@Override
	public Item getItemById(int id) {
		return entityManager.find(Item.class, id);
	}

	@Override
	public List<Item> getItemByMedOrderId(int mid) {
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		return medOrder.getItem();
	}

	@Override
	public Item updateItem(Item item, int id) {
		Item item2 = entityManager.find(Item.class, id);
		item2.setName(item.getName());
		item2.setQuantity(item.getQuantity());
		item2.setType(item.getType());
		item2.setCost(item.getCost());
		
		entityTransaction.begin();
		entityManager.merge(item2);
		entityTransaction.commit();
		return item2;
	}

	@Override
	public boolean deleteItemById(int id) {
		Item item = entityManager.find(Item.class, id);
		if(item != null)
		{
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
