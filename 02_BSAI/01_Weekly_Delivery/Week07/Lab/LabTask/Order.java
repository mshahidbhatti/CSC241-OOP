public class Order{

	private int orderNo;
	private Customer customer;
	private OrderItem orders[];

	private int itemCount;

	public Order(int orderNo, Customer customer){
		this.orderNo=orderNo;
		this.customer=customer;
	}
	public Order(int orderNo, Customer customer, int itemCount){
		this.orderNo=orderNo;
		this.customer=customer;
		this.itemCount=itemCount;
	}

	public void addItem(FoodItem foodItem, int count){
		orders[0].setFoodItem(foodItem);
	}


}