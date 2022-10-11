package com.av;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeletePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,1);
		Aadhar aadhar=entityManager.find(Aadhar.class, 2);
		entityTransaction.begin();
		entityManager.remove(aadhar);
		entityManager.remove(person);
		
		entityTransaction.commit();
	}

}
