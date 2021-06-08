package com.java.jpa.h2;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.config.HibernateSessionFactory;
import com.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class HibernateApp {
	public static void main(String[] args) {

		// Fetch an Employee
//         Employee e = getEmployee(1370);
//         System.out.println("Employee 1st Name is "+e.toString());

		// Save an Employee
//		int id = saveEmployee(); 
//		Employee e1 = getEmployee(id);
//		System.out.println("Employee with id " + id + " save successfully" + e1.getEmail() + " employee="+e1.toString());
		
		// updating an Employee with emailId
//		int id = updateEmployee();
//		System.out.println("Empoyee with id "+id+" updated successfully");
		
		// Deleting amn Employee
		int id  = deleteEmployee(200);
		System.out.println("Employee with id "+id+" deleted successfully");
	}
 
	private static Employee getEmployee(Integer empNum) {
		Employee newEmployee = new Employee(200, "krishna", "prasad", "x5000", "abc@gmail.com", "SSE"); 
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee e = session.get(Employee.class, empNum); 
		tx.commit();
		session.close();
		return e;
	}

	private static int saveEmployee() {
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee newEmployee = new Employee(200, "krishna", "prasad", "x5000", "abc@gmail.com", "SSE");
		session.save(newEmployee);
		tx.commit();
		session.close();
		return newEmployee.getEmployeeNumber();
	}
	
	private static int updateEmployee() {
		
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e = session.get(Employee.class, 200);
		
		e.setEmail("krishna@gmailcom");
		session.update(e);
		tx.commit();
		session.close();
		return e.getEmployeeNumber();
	}
	
	private static int deleteEmployee(int employeeNumber) {
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e = session.get(Employee.class, employeeNumber);
		session.delete(e);
		
		tx.commit();
		session.close();
		return e.getEmployeeNumber();
	}

}
