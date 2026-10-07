public class ArrayTest{


	public static void main(String args[]){
		

		int a=10;
		int b=20;

		int list[]=new int[10];

		System.out.println(list);
		System.out.println(list.length);
		System.out.println(list[0]);

		A []list2 =new A[5];
			for(int i=0;i<list2.length;i++)
				list2[i]=new A();

		System.out.println(list2);
		System.out.println(list2.length);
		System.out.println(list2[1]);
		System.out.println(list2[2]);


		
		
		// Student studentList[]=new Student[50];
		







		// studentList.length


	//	for(int i=0;i<studentList.length;i++)
	//		studentList[i]=new Student("Default Name","Default Email");		

		int  [] c,d,e;
		c=new int[2];

		int x,y[]=new int[10],z;


		String names[]={"Meerab","Laraib","Maryam"};

		toUpperCase(names);
	
		printNames(names);



		



		
		

		
	}

	public static void printNames(String args[]){
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);

	}

	public static void toUpperCase(String []n){
		for(int i=0;i<n.length;i++)
			{
			System.out.println(n[i].toUpperCase());
				n[i]=n[i].toUpperCase();
			
			}
	}


}