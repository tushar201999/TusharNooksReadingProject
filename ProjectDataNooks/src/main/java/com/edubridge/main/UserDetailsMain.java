package com.edubridge.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.model.Userdetails;
import com.hiber.config.DBconfig;



public class UserDetailsMain {

	public  void addUsersDetails(Userdetails u)
	{
		Session s=DBconfig.getSession();
		Transaction tx=s.beginTransaction();
		
		s.persist(u);
		tx.commit();

	}
	


}