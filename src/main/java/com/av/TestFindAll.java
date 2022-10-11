package com.av;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestFindAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("lathesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person p");
		List<Person> list=query.getResultList();
		for(Person person:list)
		{
			System.out.println("Person Name                            :"+person.getName());
			System.out.println("Person Age                             :"+person.getAge());
			System.out.println("Person Father Name                     :"+person.getAadhar().getFatherName());
			System.out.println("Person Aadhar Number                   :"+person.getAadhar().getNumber());
			System.out.println("Person                                 :"+person.getName());
		}
		
	}

}
