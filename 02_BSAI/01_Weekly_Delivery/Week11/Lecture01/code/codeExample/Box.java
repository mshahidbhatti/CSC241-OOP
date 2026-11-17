public class Box<T>{

	T a;
	Box(T a){
		this.a=a;
	}

	public boolean equals(Object other){
		return a==other;
	}


}