public class Screen{

	Seat seats[][];

	Screen(){
		seats = new Seat[5][];
		int count=10;
		for(int i=0;i<seats.length;i++)
			seats[i]=new Seat[count--];


		for(int i=0;i<seats.length;i++){
			for(int j=0;j<seats[i].length;j++)
		
			seats[i][j]=new Seat();;					

		}

		
	}

	public void display(){
		for(int i=0;i<seats.length;i++){
			for(int j=0;j<seats[i].length;j++)
		
			System.out.print(" "+seats[i][j]);					System.out.println();

		}
	}


}