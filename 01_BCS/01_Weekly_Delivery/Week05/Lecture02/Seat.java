public class Seat{

	String seatID;
	String type;
	double price;
	boolean isAvailable;

	Seat(String seatID, String type, double price){
		this.seatID=seatID;
		this.type=type;
		this.price=price;
	}

	public String toString(){
		return seatID+" "+type;
	}

}