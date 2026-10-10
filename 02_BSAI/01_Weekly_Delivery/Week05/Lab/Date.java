public class Date{
	int d;
	int m;
	int y;


	Date(int d, int m, int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}


	public String toString(){
		return String.format("%d-%d-%d",d,m,y);

	}


}