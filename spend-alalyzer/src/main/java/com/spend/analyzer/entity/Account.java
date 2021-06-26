package com.spend.analyzer.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AccountNumber;

	private double balance;
	private Date DeteOfCreatingAcc;

	@ManyToOne()
	Customer customer;

	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDeteOfCreatingAcc() {
		return DeteOfCreatingAcc;
	}

	public void setDeteOfCreatingAcc(Date deteOfCreatingAcc) {
		DeteOfCreatingAcc = deteOfCreatingAcc;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
