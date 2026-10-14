public class Demo{

	public static void main(String args[]){
		

			Seat seats[]=new Seat[50];

			//seats[0]=new Seat();

			Seat list[][]=new Seat[7][];

			System.out.println(list);
			list[0]=new Seat[12];
			list[1]=new Seat[5];
			list[2]=new Seat[7];
			list[3]=new Seat[12];
			list[4]=new Seat[5];
			list[5]=new Seat[7];
			list[6]=new Seat[10];


			System.out.println(list[0]);

			//list[0][0]=new Seat();
			System.out.println(list[0][0]);
			initObjects(list);
			printList(list);
	}

	public static void printList(Seat temp[][]){
		for(int i=0;i<temp.length;i++)
		for(int j=0; j<temp[i].length;j++)
		//if(temp[i]!=null)
		System.out.println(temp[i][j]);

	}

	public static void initObjects(Seat temp[][]){
	for(int i=0;i<temp.length;i++)
		if(temp[i]!=null)
		for(int j=0; j<temp[i].length;j++)
			temp[i][j]=new Seat("001","regular",1000);

	}





}