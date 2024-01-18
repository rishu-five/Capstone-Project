package com.maadhar.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class WaitingCitizensEmail {
	@Id
	private String emailId;

	@Override
	public String toString() {
		return emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}