package com.batch8grp1.obs.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NetbankingDto {


	private String netbankingId;
	private String accountId;
	private String password;
	private String txnPassword;
	private String otp;
	
	public NetbankingDto() {}
	
	public NetbankingDto(String netbankingId, String accountId,String password,String txnPassword,String otp) {
		this.netbankingId=netbankingId;
		this.accountId=accountId;
		this.password=password;
		this.txnPassword=txnPassword;
		this.otp=otp;
		
	}
	
	public String getNetbankingId() {
		return netbankingId;
	}

	public void setNetbankingId(String netbankingId) {
		this.netbankingId = netbankingId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTxnPassword() {
		return txnPassword;
	}

	public void setTxnPassword(String txnPassword) {
		this.txnPassword = txnPassword;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
	
}
