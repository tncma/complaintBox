
package com.complaintbox.bean;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User {
	
	public User(){}
	
/*	public User(int id){
		this.userId = id;
	}*/
	
	@PrimaryKey
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	} 

}
