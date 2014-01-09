package com.complaintbox.bean;

import java.util.Date;

import org.apache.commons.codec.binary.Base64;

import com.complaintbox.persistence.ComplaintDAO;

public class Complaint {

	private long complaintId;
	private int category;
	private String encodedBase64Image;
	private Date complaintDate;	
	private double locLat;
	private double locLong;
	private String wardNo;
	private Employee employee;
	private String supComments;
	private String userComments;
	private Date statusChangeDate;
	private int status;
	private User user;
	private int noOfVotes;
	
	public Complaint() {}
	
	public Complaint(ComplaintDAO dao, Employee employee, User user){
		this.setComplaintId(dao.getComplaintId());
		this.category = dao.getCategoryId();
		this.encodedBase64Image = Base64.encodeBase64String(dao.getImage().getBytes());
		this.complaintDate = dao.getComplaintDate();
		this.locLat = dao.getLocLat();
		this.locLong = dao.getLocLong();
		this.wardNo = dao.getWardNo();
		this.employee = employee;
		this.user = user;
		this.supComments = dao.getSupComments();
		this.userComments = dao.getUserComments();
		this.statusChangeDate = dao.getStatusChangeDate();
		this.status = dao.getStatus();
		this.noOfVotes = dao.getNoOfVotes();
	}
	
	public Date getStatusChangeDate() {
		return statusChangeDate;
	}
	public void setStatusChangeDate(Date statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}

	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	public double getLocLat() {
		return locLat;
	}
	public void setLocLat(double locLat) {
		this.locLat = locLat;
	}
	public double getLocLong() {
		return locLong;
	}
	public void setLocLong(double locLong) {
		this.locLong = locLong;
	}
	public String getWardNo() {
		return wardNo;
	}
	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}
	public String getSupComments() {
		return supComments;
	}
	public void setSupComments(String supComments) {
		this.supComments = supComments;
	}
	public String getUserComments() {
		return userComments;
	}
	public void setUserComments(String userComments) {
		this.userComments = userComments;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Employee getSupervisor() {
		return employee;
	}
	public void setSupervisor(Employee supervisor) {
		this.employee = supervisor;
	}
	public int getNoOfVotes() {
		return noOfVotes;
	}
	public void setNoOfVotes(int noOfVotes) {
		this.noOfVotes = noOfVotes;
	}
	public String getEncodedBase64Image() {
		return encodedBase64Image;
	}
	public void setEncodedBase64Image(String encodedBase64Image) {
		this.encodedBase64Image = encodedBase64Image;
	}

	public long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}
	
}
