public class Bank {
	private BasicAccount[] accounts;
	private String name;
	private double maintFee;
	private double intRate;
	private int nextId;
	private final double HIGH_ROLLER_LIMIT = 100000;
	
	/**
	 * Construct a bank with initial capacity for only 2 accounts
	 * 
	 * @param name The bank name
	 */
	public Bank(String name) {
		this.name = name;
		accounts = new BasicAccount[2];
	}
	
	/**
	 * Set the interest rate for the bank and all the accounts in it
	 * 
	 * @param intRate The interest rate
	 */
	public void setIntRate(double intRate) {
		// your code here
	}
	
	/** 
	 * Set the maintenance fee amount for the bank and all the accounts in it
	 * 
	 * @param maintFee The maintenance fee
	 */
	public void setMaintFee(double maintFee) {
		// your code here
	}
	
	/**
	 * Opens a new account for the given owner with the given balance. The account IDs
	 * are assigned successively; e.g. First account gets ID 0, second ID 1, third ID 3, ...
	 * If the balance meets the high roller limit, a high roller account is opened.
	 * If not, a student account is opened for students and a basic account for non students.
	 * 
	 * The accounts array doubles its capacity every time it is full and a new account must be
	 * opened. e.g. starts with length 2 (in the constructor) then becomes 4 when the third 
	 * account must be added, then becomes 8 when the fifth must be added, then 16, and so on.
	 * 
	 * @param owner The account owner
	 * @param balance The initial balance
	 * @return The account ID of the newly opened account.
	 */
	public int openAccount(Person owner, double balance) {
		// double the accounts array if capacity has been reached
		      
		      // your code here
		      
		      
		// open the right type of account
		    
		      // your code here
	}
	
	/**
	 * Assess the maintenance fee on all the accounts in the bank.
	 * 
	 * @return The total fee collected
	 */
	public double assessMaintenanceFee() {
		  // your code here
	}
	
	/**
	 * Pay interest to all the accounts in the bank. 
	 * 
	 * Extra credit: If the new balance on any basic or student accounts meets the high roller limit, those accounts 
	 * are converted to high roller accounts. MUST use the helper private method below to do this.
	 */
	public void payInterest() {
		  // your code here
	}
	
	/**
	 * Deposit the given amount to the account with the given ID (if it exists).
	 * 
	 * Extra credit: If the new balance on any basic or student accounts meets the high roller limit, those accounts 
	 * are converted to high roller accounts. MUST use the helper private method below to do this.
	 * 
	 * @param acctId The account ID
	 * @param amount The deposit amount 
	 */
	public void deposit(int acctId, double amount) {
		// your code here
	}
	
	/**
	 * Withdraw the given amount from the account with the given ID (if it exists). 
	 * 
	 * Extra credit: If the new balance on any high roller accounts falls below the limit, those accounts are 
	 * converted to basic or student accounts (depending on the owner). MUST use the helper private 
	 * method below to do this.
	 *
	 * @param acctId The account ID
	 * @param amount The amount to withdraw
	 */
	public void withdraw(int acctId, double amount) {
		// your code here
	}
	
	/**
	 * Print all accounts 
	 * 
	 * Implementation MUST depend on the toString() representation of accounts and print nothing else.
	 */
	public void printAllAccounts() {
		// your code here
	}
	
	/**
	 * Print all the accounts of the given account owner
	 * 
	 * Implementation MUST depend on the toString() representation of accounts and print nothing else.
	 * It MUST also depend on the .equals implementation of the Person class. Specifically, you cannot 
	 * compare IDs or names in this method.
	 * 
	 * @param owner The account owner
	 */
	public void printAccountsForOwner(Person owner) {
		// your code here
	}
	
	/**
	 * Check the balance of the account with the given ID and and if it is high enough to be 
	 * a high roller account, but it is not, the account is substituted with a new HighRollerAccount.
	 * If it is a high roller account but it should not be since the balance is low, it is substituted
	 * with a new student account if the owner is a student, or a basic account otherwise.
	 *  
	 * @param acctId The account ID
	 */
	private void changeAccountType(int acctId) {
	  
	  // Extra Credit:  10 points
	
		// your code here
	}

}
