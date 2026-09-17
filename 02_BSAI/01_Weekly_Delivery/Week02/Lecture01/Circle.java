public class Circle{

	private double radius;

	public void setNewRadius(double r){
		if(r>=0)
			radius = r;
	}

	public double getRadius(){
		return radius;
	}

	public double calArea(){
	return radius*radius*Math.PI;
	}



}