public class ArrayDemo{


	public static void main(String args[]){
		int arr[]=null; // declaration of array

		arr=new int[9];
		System.out.println(arr.length);
		System.out.println(arr[0]);

		double []list = new double[5];
		int  a[]=new int[3],b[]=new int[5],c[]=new int[8], d;

		// type identifier [] = new type [LENGTH]; 
		System.out.println(arr);
		printNumbers(arr);
		System.out.println(arr[5]);

	}

	public static void printNumbers(int arr1[]){
		System.out.println(arr1);
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		arr1[5]=55;		
	}


}