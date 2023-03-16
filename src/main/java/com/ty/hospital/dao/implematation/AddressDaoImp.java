package com.ty.hospital.dao.implematation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.AddressDao;
import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;

public class AddressDaoImp  implements AddressDao{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	BranchDaoImp branchDaoImp =  new BranchDaoImp();
	
	@Override
	public Address saveAddress(Address address, int bid) {
		Branch branch =branchDaoImp.getBranchById(bid);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return address;
	}

	@Override
	public Address getBracnchAddressById(int id) {
		return entityManager.find(Address.class, id);
	}

	@Override
	public Address updateAddress(Address address, int id) {
		Address address2 = entityManager.find(Address.class, id);
		address2.setStreet(address.getStreet());
		address2.setCity(address.getCity());
		address2.setState(address.getState());
		address2.setCountry(address.getCountry());
		address2.setPincode(address.getPincode());
		entityTransaction.begin();
		entityManager.merge(address2);
		entityTransaction.commit();
		return address2;
	}

	@Override
	public boolean deleteAddress(int id) {
		Address address = entityManager.find(Address.class, id);
		if(address != null)
		{
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
