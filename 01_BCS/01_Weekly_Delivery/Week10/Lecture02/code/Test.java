public class Test{
	public static void main(String args[]){
		Vehicle v2=new Car();

		MP v1= new Car();
		v1.play();

		MP mp= new AP();
		mp.pause();


		MP m2=new MP(){
			public void play(){
				System.out.println("play method of media player");
			}
			public void pause(){}
		};

		m2.play();

		new MP(){
			public void play(){
				System.out.println("play method of media player");
			}
			public void pause(){}
		}.play();

		
		// lambda expression
		Printable printable= e -> System.out.println(e);

		printable.printIt("Print this text");



		Multiply m1= (a,b) -> {return a*b;};

		System.out.println(m1.mul(5,5));

		print(m1);
	}

	public static void print(Multiply p){
		System.out.println(p.mul(6,7));

	}

}