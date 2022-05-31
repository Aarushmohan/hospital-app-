package com.ty.hospital.dao.implematation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dao.UserDao;
import com.ty.hospital.dto.User;

public class UserDaoImp implements UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public List<User> validateUser(String email, String password) {
		Query query = entityManager.createQuery("select u from User u where u.email=?1 and u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		return query.getResultList();
	}

	public List<User> getAllUser() {
		Query query = entityManager.createQuery("select u from User u");
		return query.getResultList();
	}

	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	public User updateUser(User user, int id) {
		User user1 = entityManager.find(User.class, id);
		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		entityTransaction.begin();
		entityManager.merge(user1);
		entityTransaction.commit();
		return user1;
	}

	public User deleteUserById(int id) {
		User user = entityManager.find(User.class, id);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		return user;

	}
}
