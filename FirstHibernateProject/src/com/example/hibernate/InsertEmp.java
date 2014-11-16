package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class InsertEmp {
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry serviceRegistry;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         
         
         
         
         Configuration configuration = new Configuration().configure();
         StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
         SessionFactory factory = configuration.buildSessionFactory(builder.build());
        

         
         Session s = factory.openSession();
         Transaction ts = s.beginTransaction();
         
         Employee emp =new Employee();
         emp.setId(1);
         emp.setName("Person1");
         emp.setEmail("person1@gmail.com");
         
         s.save(emp);
         s.flush();// SQL query for inserting the values in DB is generated
         ts.commit();
         s.close();
	}

}
