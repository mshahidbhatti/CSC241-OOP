public class Test{

	public static void main(String args[]){

		BankAccount ba1=new BankAccount("Education",3000);

		ba1.displayAccount();

		BankAccount ba2=new BankAccount("Education1",4000);

		ba2.displayAccount();
		BankAccount ba3=new BankAccount("Education1",4000);

		ba3.displayAccount();
		ba2.displayAccount();
		//ba3.bankName="ABL";


		Test2.nonSense();

	}

}