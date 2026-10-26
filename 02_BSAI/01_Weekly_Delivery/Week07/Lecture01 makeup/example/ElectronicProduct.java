public class ElectronicProduct extends Product{

	private int warrantyMonths;

    public ElectronicProduct(String name, double price, Date manufacturingDate, int months) {
	super(name, price, manufacturingDate);

	this.warrantyMonths=months;
}

	@Override
   	public void displayDetails() {
		super.displayDetails();
		System.out.println("Warranty in Months:"+warrantyMonths);
	}



}