public class Rectangle extends Shape2D{
		double length;
		double width;

		Rectangle(String name, String color, double length, double width){
			super(name,color,0);


	}

	public String toString(){

		return super.toString()+" "+ length + " "+ width;
	}

}