package com.spend.analyzer.reqdto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.UniqueElements;

public class CustomerRequestDTO {

	@NotEmpty
	private String UserName;
	@NotEmpty(message = "username should not be empty")
	@Max(value = 8, message = "password should not be more then 8 char")
	private String password;
	@UniqueElements
	@Email
	private String EmailId;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
}
