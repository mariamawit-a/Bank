
	protected int acctId;
	protected Person owner;
	protected String bank;
	protected double balance;   // never negative
	protected double intRate;   // the interest rate, e.g. 0.02  (for 2 %)
	protected double maintFee;
	
	public BasicAccount(int acctId, Person owner, String bank) {
		// your code here
	}
	
	/**
	 * Deposit the given amount if positive. Negative amounts are ignored.
	 * 
	 * @param amount The amount to deposit
	 * @return The balance after deposit was accepted
	 */
	public double deposit(double amount) {
		// your code here
	}
	
	/**
	 * Withdraw the given amount if positive and if there are enough funds. 
	 * Negative amounts are ignored. If the amount to be withdrawn is higher than the balance,
	 * withdraw the entire balance.
	 * 
	 * @param amount The amount to withdraw
	 * @return The amount withdrawn
	 */
	public double withdraw(double amount) {
		// your code here
	}
	
	public double getBalance() {
		// your code here
	}
	
	public int getAcctId() {
		// your code here
	}
	
	public Person getOwner() {
		// your code here
	}
	
	public void setInterestRate(double intRate) {
		// your code here
	}
	
	public void setMaintFee(double maintFee) {
		// your code here
	}
	
	/**
	 * Add the accrued interest to the account.
	 * E.g. If balance is 100 and intRate is 0.02, balance should become 102.
	 */
	public void addInterest() {
		// your code here
	}
	
	/**
	 * Withdraw the account maintenance fee
	 * 
	 * @return The fee collected
	 */
	public double assessMaintenanceFee() {
		// your code here
	}
	
	// override the toString method to return: "Account of " + owner + " with ID " + acctId + " and a balance of " + balance
	// your code here
	
	
	// override the equals method to return true if the acctId and bank name are equal
	public boolean equals(Object other) {
	  // your code here
	}

