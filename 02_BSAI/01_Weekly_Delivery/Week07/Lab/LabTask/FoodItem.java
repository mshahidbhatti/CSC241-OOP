public class FoodItem{
	private int itemCode;
	private String name;
	private double price;
	private FoodCategory category;

	public FoodItem(int itemCode, String name, double price, FoodCategory category){
		this.itemCode=itemCode;
		this.name=name;
		this.price=price;
		this.category=category;
	}
	public FoodItem(int itemCode, String name, double price){
		this.itemCode=itemCode;
		this.name=name;
		this.price=price;
		this.category=new FoodCategory();
	}

	public void displayItem(){
		System.out.println("Item Code:"+itemCode);
		System.out.println("Item Name:"+name);
		System.out.println("Item price:"+price);
		System.out.println("Item Code:"+category.category[0]);

	}






}