package com.av;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAndAadhar {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("lathesh");
		person.setAge(20);
		Aadhar aadhar=new Aadhar();
		aadhar.setFatherName("hasaranga");
		aadhar.setNumber("3234 4455 6566");
		aadhar.setPerson(person);
		person.setAadhar(aadhar);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityManager.persist(person);
		entityTransaction.commit();
				

	}

}
