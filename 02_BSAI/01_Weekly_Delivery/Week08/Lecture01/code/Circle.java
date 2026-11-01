public class Circle extends Shape2D{
	double radius;

	Circle(){

		this(0);

	}

	Circle(double radius){
		this("", 1, "",radius);
	}

	Circle(String name, int borderWeight, String fillColor,double radius){
		super(name, borderWeight, fillColor);
		this.radius=radius;
	}


	@Override
	public String toString(){
			return String.format("%s %.2f", super.toString(),radius);

	}

	public double calArea(){

		return Math.PI * Math.pow(radius,2);
	}

}