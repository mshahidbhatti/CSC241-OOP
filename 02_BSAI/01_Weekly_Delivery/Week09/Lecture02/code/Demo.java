public class Demo{

	public static void main(String args[]){
		A list[] =new A[10];
		list[0] =new B();
		list[1] =new C();
		list[2] =new C();
		list[3] =new B();
		list[4] =new D();
		list[5] =new D();


		//printA(list);
 		printD(list);

	}


	public static void printA(A[] arr){

		for(A temp: arr)
			if(temp!=null)
				temp.calculate();

	}


	public static void printD(A[] arr){

		for(A temp: arr)
			if(temp!=null)
				if (temp instanceof D)
					{
					D d=(D)temp;
					d.calOfD();

					}

	}



}