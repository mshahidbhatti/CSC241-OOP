import java.lang.Object;

public class Employee extends Person{
	
		double salary;

		Employee(String name, double salary){
			super(name);
			this.salary=salary;
		}


	@Override
   public String toString()
   {
	return String.format("%s %.2f", super.toString(), this.salary);
  
   }


}