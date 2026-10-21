public class Shape extends Object{

	String name;
	String color;
	Point centerPoint;
	

	Shape(String name, String color){
		this.name=name;
		this.color=color;
	}

	Shape(String name, String color, Point point){
		this.name=name;
		this.color=color;
		this.centerPoint=point;
	}

		
	public String toString(){

		return name +" "+color+" "+centerPoint;
	}
}