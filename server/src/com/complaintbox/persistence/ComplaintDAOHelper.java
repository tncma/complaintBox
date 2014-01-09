package com.complaintbox.persistence;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;

import com.complaintbox.bean.Complaint;
import com.complaintbox.bean.Employee;
import com.complaintbox.bean.User;

public class ComplaintDAOHelper {

	public static Complaint getComplaintDetails(long complaintId){
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			ComplaintDAO complaintDao = pm.getObjectById(ComplaintDAO.class, complaintId);
			return getComplaintObj(complaintDao);
		} catch(JDOObjectNotFoundException jodEx){
			return new Complaint();
		} finally {
			pm.close();
		}
	}
	
	public static Complaint getComplaintObj(ComplaintDAO complaintDao){
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		User user;
		if(complaintDao.getUserId() != 0){
			user = pm.getObjectById(User.class, complaintDao.getUserId());
		} else {
			user = new User();
		}
		
		Employee employee;
		if(complaintDao.getEmployeeId() != 0){
			employee = pm.getObjectById(Employee.class, complaintDao.getEmployeeId());
		} else {
			employee = new Employee();
		}
		
		return new Complaint(complaintDao, employee, user);
		
	}
	
}
