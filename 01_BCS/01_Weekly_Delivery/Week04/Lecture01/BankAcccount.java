class BankAccount{

	// instance variables
	private String accountID;
	private double balance;
	private String title;

	private double initialBalance;

	// class variables
	private static int counter=0;
	static String bankName="IBL";

	public BankAccount(String title,double balance){
		accountID="00"+(++counter);
		if(title!=null)
			this.title=title;
		if(balance>=initialBalance)
			this.balance=balance;
	}


	public void displayAccount(){
		System.out.println("Bank Name "+bankName);
		System.out.println("ID "+accountID);
		System.out.println("Title "+title);
		System.out.println("Balance "+balance);
	}

	


}