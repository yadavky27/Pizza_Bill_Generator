package krishna.com;

public class DeluxPizza extends pizza {

	public DeluxPizza(boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
	}
	public void addExtraCheese()
	{
		this.price+=extraCheesePrice;
	}
	public void addExtraTopping()
	{
		this.price+=extraToppingPrice;
		
	}
	

}
