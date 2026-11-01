public class Demo2{


	public static void main(String args[]){

		Shape shapes[]=new Shape[14];

		shapes[0]=new Shape("Shape ", 1);
		shapes[1]=new Shape2D("Shape 2 D", 1,"Red");
		shapes[2]=new Circle("Circle 2 D", 1,"Red",2);
		shapes[3]=new Circle("Circle 2 D", 5,"Red",2);
		shapes[4]=new Circle("Circle 2 D", 2,"Red",2);

		for(int i=0;i<shapes.length;i++)
			if(shapes[i] instanceof Circle)
			System.out.println(((Circle)shapes[i]).calArea());


	}


	public static void updateCircles(Shape list[]){
		for(int i=0;i<shapes.length;i++)
			if(shapes[i] instanceof Circle)
			    {
				double r=((Circle)shapes[i]).radius;
				
				((Circle)shapes[i]).radius=((Circle)shapes[i]).radius+13;
				}

	}
}