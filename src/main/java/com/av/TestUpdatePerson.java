package com.av;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdatePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,1);
		person.setName("malinga");
		person.setAge(23);
		Aadhar aadhar=entityManager.find(Aadhar.class,1);
		aadhar.setFatherName("sangakara");
		aadhar.setNumber("2374 3455 5654");
		aadhar.setPerson(person);
		person.setAadhar(aadhar);
		entityTransaction.begin();
		entityManager.merge(aadhar);
		entityManager.merge(person);
		entityTransaction.commit();

	}

}
