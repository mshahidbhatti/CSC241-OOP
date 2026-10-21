public class Shape2D extends Shape{

	double area;

	Shape2D(){
		super("Unknown","Undefined");

	}

	Shape2D(String name, String color, double area){
		super(name,color);
		this.area=area;
	}

	public String toString(){

		return super.toString()+" "+ area;
	}

}