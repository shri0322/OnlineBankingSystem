package com.batch8grp1.obs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name="UserDetails")
public class User {

	@Id
	@Column(name="UserId",nullable=false)
	private String userId;
	
	private String title;
	
	@Column(name="Firstname",nullable=false)
	private String firstName;
	
	@Column(name="Lname",nullable=false)
	private String lname;
	
	@Column(name="Fname",nullable=false)
	private String fName;
	
	@Column(name="MobileNo",nullable=false)
	private String mobileNo;
	
	@Column(name="EmailId",nullable=false)
	private String emailId;
	
	@Column(name="AadharNo",nullable=false)
	private String aadharNo;

	@Column(name="DoB",nullable=false)
	private String dOB;
	
	@Column(name="Address",nullable=false)
	private String address;
	
	@Column(name="OccupationType",nullable=false)
	private String occupationType;
	
	@Column(name="SourceofIncome",nullable=false)
	private String sourceofIncome;
	
	@Column(name="GrossAnnualIncome",nullable=false)
	private String grossAnnualIncome;
	
	@Column(name="AccountId",nullable=false)
	private String accountId;
	
	public User(String userId, String firstName, String lname, String fName, String mobileNo, String emailId,
			String aadharNo, String dOB, String address, String occupationType, String sourceofIncome,
			String grossAnnualIncome, String accountId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lname = lname;
		this.fName = fName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.aadharNo = aadharNo;
		this.dOB = dOB;
		this.address = address;
		this.occupationType = occupationType;
		this.sourceofIncome = sourceofIncome;
		this.grossAnnualIncome = grossAnnualIncome;
		this.accountId = accountId;
	}
	
	
	public String getUserId() {
		return userId;
	}

	public String getAccountId() {
		return accountId;
	}

}
