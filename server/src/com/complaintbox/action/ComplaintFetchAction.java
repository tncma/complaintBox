package com.complaintbox.action;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.complaintbox.bean.Complaint;
import com.complaintbox.persistence.ComplaintDAO;
import com.complaintbox.persistence.ComplaintDAOHelper;
import com.complaintbox.persistence.PMF;
import com.opensymphony.xwork2.ActionSupport;

public class ComplaintFetchAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;

	private HttpServletRequest request;
	
	private Complaint complaint;
	
	private List<Complaint> complaintList;
	
	public String loadComplaintDetails(){
		long complaintId = Long.parseLong(request.getParameter("id"));		
		setComplaint(ComplaintDAOHelper.getComplaintDetails(complaintId));
		return SUCCESS;
	}
	
	public String loadUserComplaints(){
		
		long userId = Long.parseLong(request.getParameter("userId"));
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Query query = pm.newQuery(ComplaintDAO.class,
                "userId == "  + userId);
		
		try {
			List<ComplaintDAO> complaintDaoList = (List<ComplaintDAO>) query.execute();
			complaintList = new ArrayList<Complaint>();
			for(ComplaintDAO complaintDAO : complaintDaoList){
				complaintList.add(ComplaintDAOHelper.getComplaintObj(complaintDAO));
			}			
		} finally {
			query.closeAll();
		}
		
		return SUCCESS;
	}
	
	public String loadWardComplaints(){
		
		String wardNo = request.getParameter("wardNo");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Query query = pm.newQuery(ComplaintDAO.class,
                "wardNo == '" + wardNo + "'");
		
		try {
			List<ComplaintDAO> complaintDaoList = (List<ComplaintDAO>) query.execute();
			complaintList = new ArrayList<Complaint>();
			for(ComplaintDAO complaintDAO : complaintDaoList){
				complaintList.add(ComplaintDAOHelper.getComplaintObj(complaintDAO));
			}			
		} finally {
			query.closeAll();
		}
		
		return SUCCESS;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;		
	}

	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}

	public List<Complaint> getComplaintList() {
		return complaintList;
	}

	public void setComplaintList(List<Complaint> complaintList) {
		this.complaintList = complaintList;
	}
}
