package com.complaintbox.persistence;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class ComplaintDAO {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
    @Persistent
	private int categoryId;
	
	@Persistent
	private Blob image;
	
	@Persistent
	private Date complaintDate;
	
	@Persistent
	private double locLat;
	
	@Persistent
	private double locLong;
	
	@Persistent
	private String wardNo;
	
	@Persistent
	private long employeeId;
	
	@Persistent
	private String supComments;
	
	@Persistent
	private String userComments;
	
	@Persistent
	private Date statusChangeDate;
	
	@Persistent
	private int status;
	
	@Persistent
	private long userId;
	
	@Persistent
	private int noOfVotes;
	
	public long getComplaintId(){
		return key.getId();
	}
	
	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
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

	public Date getStatusChangeDate() {
		return statusChangeDate;
	}

	public void setStatusChangeDate(Date statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNoOfVotes() {
		return noOfVotes;
	}

	public void setNoOfVotes(int noOfVotes) {
		this.noOfVotes = noOfVotes;
	}
	
	public void setImage(byte[] imageByteArray){
		this.image = new Blob(imageByteArray);
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	
}