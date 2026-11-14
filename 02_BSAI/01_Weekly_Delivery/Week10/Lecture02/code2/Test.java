public class Test{
	public static void main(String args[]){
		Driveable driveable=new Vehicle();

		driveable.drive();

		Printable printable=new PrintThings();
		printable.printIt(" this is our text");

		// anonymous inner class 
		Driveable drive2= new Driveable(){
			public void drive(){
				System.out.println("Drive method");
			}
			public void steer(){
				System.out.println("Steer method");

			}
		};
		drive2.drive();

		// Driveable drive2= new Driveable(); not allowed


		Printable printable2 = new Printable(){
			public void printIt(String text){
				System.out.println(text);
			}

		};


		printable2.printIt("Functional interface method");

		new Printable(){
			public void printIt(String text){
				System.out.println(text);
			}

		}.printIt("Test method");
		
		
					// lambda expression
		Printable printable3 = (e)->System.out.println(e);


		//printable3.printIt("Simplified method");

		testMehtod(printable3);





	}

	public static void testMehtod(Printable p){
			//System.out.println("Static method");
			p.printIt("Functional interace from static method........");
	}

}