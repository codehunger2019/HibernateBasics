package com.test.basic;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDao {
	public static void main(String[] args) {
		System.out.println("App started");
		
		Configuration cfg=new Configuration().configure();
		//cfg.configure();
		System.out.println("Configuration done");
		System.out.println("Crete sesion factory");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println("sessiomn factory  created");

}
}