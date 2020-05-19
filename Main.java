public class Main {
	/**
	 * Test all your classes well. The code below is given
	 * just to give an idea of how the client expects to use your classes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Bank b = new Bank("Bank of Rupt");
		
		b.setIntRate(0.1);
		b.setMaintFee(50);
		
		Person bob = new Person(11315, "Bob");
		int bobAcctId = b.openAccount(bob, 1000);
		
		Person alice = new Student(12512, "Alice", "SMC", 1234);
		int aliceAcctId = b.openAccount(alice, 500);
		
		Person rich = new Person(51542, "Rich P. Person");
		int richAcctId = b.openAccount(rich, 1000000);
		
		Person richStudent = new Student(23814, "Rich S. Student", "USC", 1191);
		int richStudentAcctId = b.openAccount(richStudent, 100100);
		
		// another account for Rich S. Student
		b.openAccount(richStudent, 30000);
		
		// another account for Alice
		b.openAccount(alice, 100);
		
		// another account for Bob
		b.openAccount(bob, 5000);
		
		
		System.out.println("All the accounts: ");
		b.printAllAccounts();
		System.out.println();
		
		System.out.println("All the accounts of Alice: ");
		b.printAccountsForOwner(alice);
		System.out.println();
		
		System.out.println("Paying interest : ");
		b.payInterest();
		b.printAllAccounts();
		System.out.println();
		
		System.out.println("Assessing maintenance fees: ");
		b.assessMaintenanceFee();
		b.printAllAccounts();
		System.out.println();
		
		System.out.println("Rich P. Person buys a Ferrari, Alice wins the lottery, Rich. S. Student pays tuition ...");
		b.withdraw(richAcctId, 331000);
		b.printAccountsForOwner(rich);
		b.deposit(aliceAcctId, 100000);
		b.printAccountsForOwner(alice);
		b.withdraw(richStudentAcctId, 45000);
		b.printAccountsForOwner(richStudent);
		System.out.println();
		
	}
}

/*
Output:
 
All the accounts: 
Account of Person: Bob with ID 0 and a balance of 1000.0
Account of Student: Alice at SMC with ID 1 and a balance of 500.0
High Roller Account of Person: Rich P. Person with ID 2 and a balance of 1000000.0
High Roller Account of Student: Rich S. Student at USC with ID 3 and a balance of 100100.0
Account of Student: Rich S. Student at USC with ID 4 and a balance of 30000.0
Account of Student: Alice at SMC with ID 5 and a balance of 100.0
Account of Person: Bob with ID 6 and a balance of 5000.0

All the accounts of Alice: 
Account of Student: Alice at SMC with ID 1 and a balance of 500.0
Account of Student: Alice at SMC with ID 5 and a balance of 100.0

Paying interest : 
Account of Person: Bob with ID 0 and a balance of 1100.0
Account of Student: Alice at SMC with ID 1 and a balance of 550.0
High Roller Account of Person: Rich P. Person with ID 2 and a balance of 1210000.0
High Roller Account of Student: Rich S. Student at USC with ID 3 and a balance of 121121.0
Account of Student: Rich S. Student at USC with ID 4 and a balance of 33000.0
Account of Student: Alice at SMC with ID 5 and a balance of 110.0
Account of Person: Bob with ID 6 and a balance of 5500.0

Assessing maintenance fees: 
Account of Person: Bob with ID 0 and a balance of 1050.0
Account of Student: Alice at SMC with ID 1 and a balance of 550.0
High Roller Account of Person: Rich P. Person with ID 2 and a balance of 1210000.0
High Roller Account of Student: Rich S. Student at USC with ID 3 and a balance of 121121.0
Account of Student: Rich S. Student at USC with ID 4 and a balance of 33000.0
Account of Student: Alice at SMC with ID 5 and a balance of 110.0
Account of Person: Bob with ID 6 and a balance of 5450.0

Rich P. Person buys a Ferrari, Alice wins the lottery, Rich. S. Student pays tuition ...
High Roller Account of Person: Rich P. Person with ID 2 and a balance of 879000.0
High Roller Account of Student: Alice at SMC with ID 1 and a balance of 100550.0
Account of Student: Alice at SMC with ID 5 and a balance of 110.0
Account of Student: Rich S. Student at USC with ID 3 and a balance of 76121.0
Account of Student: Rich S. Student at USC with ID 4 and a balance of 33000.0
 
 */
