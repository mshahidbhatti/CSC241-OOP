public class OrderItem{

	private FoodItem item;
	private int quantity;

	public OrderItem(FoodItem item, int quantity){
		this.item=item;
		this.quantity=quantity;
	}
	public double getSubTotal(){
		return 0;
	}

	public FoodItem getFoodItem(){
		return item;
	}

	public void setFoodItem(FoodItem item){
		this.item=item;
	}

}