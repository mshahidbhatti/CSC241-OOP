public class CommissionEmployee extends Employee{
	
		double comissionRate;

		CommissionEmployee(String name, double salary, double cr){
			super(name, salary);
			this.comissionRate=cr;
		}

	@Override
   	public String toString()
   	{
		return String.format("%s %f", super.toString(), this.comissionRate);
  
   	}


	public static void method1(){
		Employee.method1();
		System.out.println("Static method CR");
	}

/*
	@Override
	public final void finalMethod(){

	} */

}