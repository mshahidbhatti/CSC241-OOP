class Rectangle{
	// data member / states
	private double length;
	private double width;

	// method 
	
	double calArea(){
		return length*width;
	}

	public void setLength(double newlength){
		if(newlength>=0)
		  length=newlength;
	}

	public double getLength(){
		return length;
	}
}