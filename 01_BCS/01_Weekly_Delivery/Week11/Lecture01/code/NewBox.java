public class NewBox<T>{

	T t;

	NewBox(T t){
		this.t=t;
	}

	T getBox(){
		return t;
	}

	void setBox(T t){
		this.t=t;
	}
}