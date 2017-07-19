package io.zipcoder.access.control.lab.bank.account;

import java.util.ArrayList;

import com.zipcodewilmington.anthropoid.Person;





public class BankAccountFactory {
	private BankAccountFactory() {
        /** this class cannot be instantiated*/
	}

	// factory method
    public static BankAccount createBankAccount() {    	
    	String accountHolderName = Console.getStringInput("What is your name"); 
    	String accountType = Console.getStringInput("What type of account would you like: Check, Savings or Investment");
    	//Create bank account number int accountNumber = ;
    	//Create account status to OPEN
    	Console.println("What is account balance");
    	//Set interest rate
    	Console.println("Would you like over draft protection: yes, no, auto account transfer");
    	
    	//Store the data; 
        	
    	
    	BankAccount bankAccount1 = new BankAccount(String accountType, int accountNumber, AccountStatus accountStatus, double accountBalance, double interestRate, String accountHolderName, OverDraftProtection overDraftProtection, ArrayList<String> Transactions);
        BankAccountWarehouse.addBankAccount(bankAccount1);
        return bankAccount1;

    	}

        public static Person[] createRandomPerson(int arrayLength) {
            Person[] people = new Person[arrayLength];
            int currentIndex = 0;
            while(currentIndex < people.length) {
                people[currentIndex] = createRandomPerson();
                currentIndex++;
            }
            return people;

}
	
	
/**
public class PersonFactory {
    private PersonFactory() {
         this class cannot be instantiated 
    }

    
    // factory method
    public static Person createRandomPerson() {
        String randomString = RandomUtils.createString('a', 'z', 10);
        String name = StringUtils.capitalizeFirstChar(randomString);
        int age = RandomUtils.createInteger(0, 100);
        boolean isMale = RandomUtils.createBoolean(50);

        Person randomPerson = new Person(name, age, isMale);
        PersonWarehouse.addPerson(randomPerson);
        return randomPerson;
    }
    
    
    
    public static Person[] createRandomPerson(int arrayLength) {
        Person[] people = new Person[arrayLength];
        int currentIndex = 0;
        while(currentIndex < people.length) {
            people[currentIndex] = createRandomPerson();
            currentIndex++;
        }
        return people;
    }
} */