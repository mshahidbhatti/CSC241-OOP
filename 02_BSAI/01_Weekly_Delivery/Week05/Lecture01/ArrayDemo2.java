public class ArrayDemo2{


	public static void main(String args[]){
		
	//	System.out.println(args[0]);

		A list[] = new A[5];

		System.out.println(list);
		for(int i=0;i<list.length;i++)
			list[i]=new A(5);

		for(int i=0;i<list.length;i++)
			list[i].setA(list[i].getA()+2);

		for(int i=0;i<list.length;i++)
			list[i].displayA();


		System.out.println(list[0]);

		String names[]=new String[5];

		names[0]="ABC";
		names[1]=new String("name2");
		System.out.println(names[2]);


	}
}