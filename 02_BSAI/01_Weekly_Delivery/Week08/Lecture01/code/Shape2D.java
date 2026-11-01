public class Shape2D extends Shape{
	String fillColor;


	Shape2D(String name, int borderWeight, String fillColor){
		super(name, borderWeight);
		
		this.fillColor=fillColor;

	}

	@Override
	public String toString(){
		
			return String.format("%s %s", super.toString(),fillColor);
		//return super.toString()+ fillColor;

	}



}