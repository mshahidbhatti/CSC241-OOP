public class Demo{

	public static void main(String args[]){
		Person p1=new Person("Name 1");

		System.out.println(p1);

		Employee emp1=new Employee("Emp 1", 2000);

		System.out.println(emp1);

	CommissionEmployee cEmp=new CommissionEmployee("Com Emp", 3000, 4);
		System.out.println(cEmp);


		System.out.println(cEmp.getClassName());



		emp1.method1();
		cEmp.method1();

		
	}
}