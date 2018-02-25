package com.learning.cmad.user.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.cmad.user.api.User;

public class JPAUserDAO implements UserDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_db");
	private EntityManager em = emf.createEntityManager();
	
	@Override
	public void createUser(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}

}
