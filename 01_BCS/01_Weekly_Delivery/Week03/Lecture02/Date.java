public class Date{
	private int day=1;
	private int month=1;
	private int year=1;
	Date(int day,int month, int year){
			setDay(day);
			setMonth(month);
			setYear(year);
		}

	Date(int month, int year){
		// System.out.println("Two Argument constructor.");
		this(1,month,year);
	}
	Date( int year){
		this(1,year);
	}

	Date(){
		this(26,9,2026);
	}

	public void setDay(int day){
		if(day>=1&&day<=31)
			this.day=day;
	}
	public void setMonth(int month){
		if(month>=1&&month<=12)
			this.month=month;
	}
	public void setYear(int year){
		if(year>1)
			this.year=year;
	}
	public int getDay(){return day;}
	public int getMonth(){return month;}
	public int getYear(){return year;}
	public void displayDate(){
		System.out.printf("%02d-%02d-%04d\n",day,month,year);
	}


}