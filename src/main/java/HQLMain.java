import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

	/*	Employee e1 = new Employee(1,"Ram","Sangli",20000);
		Employee e2 = new Employee(2,"Snehal","Mumbai",35000);
		Employee e3 = new Employee(3,"Neha","Satara",40000);
		Employee e4 = new Employee(4,"Atharv","Kolhapur",45000);
		
		session.save(e4);
		session.save(e3);
		session.save(e2);
		session.save(e1);*/
		
	  
	   
/*	   //select* from employee 
	  Query query = session.createQuery("from Employee");
	  List<Employee> elist = query.list(); for(Employee e : elist) {
	  System.out.println(e); }*/
		
		
/*		//select  *from employee where city='Pune"
		Query query1 = session.createQuery("from Employee where city =:c ");
		query1.setParameter("c", "Sangli");
		List<Object> elist1 = query1.list();
		for(Object s1 : elist1)
		{
			System.out.println(s1);
		}*/
		
		//select city from employee
		Query query2 = session.createQuery("select city from Employee");
		List<Object> elist2 = query2.list();
		for(Object s2 : elist2)
		{
			System.out.println(s2);
		}
		

		
		
		
		
		tx.commit();
		session.close();

	}

}
