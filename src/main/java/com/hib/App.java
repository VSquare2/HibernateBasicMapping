package com.hib;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{ 	 
	
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setLid(1);
		l.setLname("HP");
		
		
		Laptop l1=new Laptop();
		l1.setLid(2);
		l1.setLname("DELL");
//		
//		Laptop l2=new Laptop();
//		l2.setLid(3);
//		l2.setLname("LENOVO");
		
		ArrayList<Laptop> llist=new ArrayList<Laptop>();
		llist.add(l);
		llist.add(l1);
//		llist.add(l2);
		
		StudentHib st=new StudentHib();
		st.setSid(101);
		st.setSname("RAM");
		st.setMarks(100);
		st.getLaplist().add(l);
		//st.getLaplist().add(l1);
		
		l.getStuds().add(st);
		
		StudentHib st1=new StudentHib();
		st1.setSid(102);
		st1.setSname("SHAM");
		st1.setMarks(99);
		
		ArrayList<StudentHib> slist=new ArrayList<StudentHib>();
		slist.add(st);
		slist.add(st1);
		
		st1.setLaplist(llist);
		
		
		
		
		//st.getLaptopList().add(l1);
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(StudentHib.class).addAnnotatedClass(Laptop.class);
	    ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf=con.buildSessionFactory(reg);
	    
	    //It opens the Connection/Session with Database 
	    Session s= sf.openSession();
	    
	    
	    Transaction t = s.beginTransaction();
	    
	    
	    s.save(st);
	    s.save(l);
	   
	    t.commit();
	}
	
	
    
}
