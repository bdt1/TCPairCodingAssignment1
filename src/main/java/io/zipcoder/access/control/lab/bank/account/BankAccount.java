package io.zipcoder.access.control.lab.bank.account;

import java.util.ArrayList;
    
public class BankAccount {
		private String accountType;
		private int accountNumber;
		public AccountStatus accountStatus;
		private double accountBalance;
		private double interestRate;
		private String accountHolderName;
		public OverDraftProtection overDraftProtection;
		private ArrayList<String> Transactions;
		
	
		
		
		
		public BankAccount(String accountType, int accountNumber, AccountStatus accountStatus, double accountBalance, double interestRate, String accountHolderName, OverDraftProtection overDraftProtection, ArrayList<String> Transactions){
			this.accountType = accountType;
			this.accountNumber = accountNumber;
			this.accountStatus = accountStatus;
			this.accountBalance = accountBalance;
			this.interestRate = interestRate;
			this.accountHolderName = accountHolderName;
			this.overDraftProtection = overDraftProtection;
			Transactions = new ArrayList<>();

			
			
			
		/* This design cannot be tested
		    public BankAccount() {
			this.accountType = Console.getStringInput("What is the account type?");
			//this.accountNumber = Console.getIntInput("What is the account number?");
			this.accountStatus = Console.getAccountStatus("What is the account name?");
			//this.accountBalance = Console.getDoubleInput("What is the account balance?");
			//this.interestRate = Console.getDoubleInput("What is the interest rate?");
			this.accountHolderName = Console.getStringInput("What is the account holder name?");
		
		}*/
					
			
			
			
			
//everything related to transaction on bank account will occur in this class ie: withdrawal and deposit			
			
		}
		
		public String getAccountType() {
	        return accountType;
	    }
		public int getAccountNumber() {
	        return accountNumber;
		}
		public String getAccountStatus() {
	        return AccountStatus;
	    }
		public double getAccountBalance() {
	        return accountBalance;
	    }
		public double getInterestRate() {
	        return interestRate;
	    }
		
		public String getAccountHolderName() {
	        return accountHolderName;
	    }
		/*public String getOverDraftProtection() {
	        return overDraftProtection;
	    }*/
		public  ArrayList<String> getTransactions() {
	        return Transactions;
	    }
	

	


}

