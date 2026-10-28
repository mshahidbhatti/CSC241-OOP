public class Rectangle{

	double length;
	double width;

	Rectangle (Rectangle other){
		this.length=other.length;
		this.width=other.width;
	}
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;

	}

	@Override
	public boolean equals(Object o){
		Rectangle tempR= (Rectangle)o;		
		
		return this.length==tempR.length && this.width==tempR.width;
	}



}