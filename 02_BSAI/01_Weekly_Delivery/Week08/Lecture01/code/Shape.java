public class Shape extends Object{


	String name;
	int borderWeight;


	Shape(String name, int borderWeight){
		super();
		
		this.name=name;
		this.borderWeight=borderWeight;

	}

	public String getInformation(){
		return String.format("%s %d",name, borderWeight);
	}

/*	public boolean equals(Object other){
		System.out.println("equals with object as argument");

		Shape shape= (Shape)other;
		//Object o=new Shape("",4);
		return this.name==shape.name;

	} */

	//public boolean equals(Object obj)
	@Override
	public boolean equals(Object other){
		Shape shape= (Shape)other;  // explicitly downcast
		System.out.println("equals with shape as argument");
		return this.name==shape.name;
	}


	public String toString()
  	{
		return name+ " "+borderWeight;  
     		//return getClass().getName() + '@' + Integer.toHexString(hashCode());
   	}
	

	

}