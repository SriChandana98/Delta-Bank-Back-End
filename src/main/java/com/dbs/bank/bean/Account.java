package com.dbs.bank.bean;


	

	    


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
	@Entity
	public class Account {
		@Id
		@GeneratedValue()
		private long accountNo;
		private int pinNumber;
		private String accountType;
		private double accountBalance;
		private String firstName;
		private String lastName;
		private String email;
		private long phoneNumber;
		private String gender;
		private String dob;
		private long adhaar;
		public long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}
		public int getPinNumber() {
			return pinNumber;
		}
		public void setPinNumber(int pinNumber) {
			this.pinNumber = pinNumber;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public long getAdhaar() {
			return adhaar;
		}
		public void setAdhaar(long adhaar) {
			this.adhaar = adhaar;
		}
		@Override
		public String toString() {
			return "Account [accountNo=" + accountNo + ", pinNumber=" + pinNumber + ", accountType=" + accountType
					+", accountBalance=" + accountBalance + ", firstName="
					+ firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber
					+ ", gender=" + gender + ", dob=" + dob + ", adhaar=" + adhaar + "]";
		}

		
				
	}


