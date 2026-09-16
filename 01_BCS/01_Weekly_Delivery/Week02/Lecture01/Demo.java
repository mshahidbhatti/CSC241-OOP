public class Demo{


	public static void main(String args[]){
		//primitive data types
		// round numbers
		long l=400; // 4 byte
		int i1=10;  // 4 bytes of memory
		int i2=20;
		short s=23; // 2 bytes
		byte b=20;  // 1 byte


		// floating point numbers
		double d=100.0;   // 8 bytes
		float f=(float)200.0;  // 4 bytes

		char ch='a';
		boolean bool=true; // false
		
		


		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r2=r1;
		if(r1==r2)								System.out.println("Equals");
		else
			System.out.println("Not Equals");			System.out.println(r1);


		

	}

}