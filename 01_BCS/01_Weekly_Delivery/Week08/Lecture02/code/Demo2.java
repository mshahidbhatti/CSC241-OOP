public class Demo2{

	public static void main(String args[]){
		Person persons[]=new Person[20];

		persons[0]=new Person("Person class 1");		
		persons[1]=new Employee("Employee class 1",5000);
		persons[2]=new CommissionEmployee("Employee class 1",5000,5);
		persons[3]=new Employee("Employee class 1",5000);
		persons[4]=new Employee("Employee class 1",5000);

		
//		for(int i=0; i< persons.length;i++)
//			System.out.println(persons[i]);

		increaseSalary(persons);

		
	}

	public static void increaseSalary(Person list[]){
		for(int i=0; i< list.length;i++)
			if(list[i] instanceof Employee){
				Employee temp=(Employee)list[i];
				temp.salary=temp.salary+temp.salary*0.10;
				System.out.println(temp.salary);

				}

	}
}