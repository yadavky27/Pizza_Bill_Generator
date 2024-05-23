package krishna.com;

import java.util.Scanner;

public class pizza {
	protected int price;
	private Boolean veg;
	
	protected int extraCheesePrice=100;
	protected int extraToppingPrice=150;
	protected int backPackPrice=20;
	

	protected int basePizzaPrice;
	
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingAdded=false;
	private boolean isOptedForTakeAway=false;
	
	Scanner sc=new Scanner(System.in);
	
	public pizza(boolean veg)
	{
		this.veg=veg;
		if(this.veg)
		{
			this.price=300;
		}
		else
		{
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	public void addExtraCheese()
	{
		System.out.println("Can you want Extra Cheese (y/n) =>");
		char ch= Character.toLowerCase(sc.next().charAt(0));
		
		switch(ch)
		{
		case ('y'):
			isExtraCheeseAdded=true;
			this.price=this.price+extraCheesePrice;
			break;
		case ('n'):
			isExtraCheeseAdded=false;
			break;
		}
	}
	public void addExtraTopping()
	{
		System.out.println("Can you want Extra Topping (y/n) =>");
		char ch= Character.toLowerCase(sc.next().charAt(0));
		
		switch(ch)
		{
		case ('y'):
			isExtraToppingAdded=true;
			this.price=this.price+extraToppingPrice;
			break;
		case ('n'):
			isExtraToppingAdded=false;
			break;
		}
	}
	public void takeAway()
	{
		System.out.println("Can you want Take Away (y/n) =>");
		char ch= Character.toLowerCase(sc.next().charAt(0));
		
		switch(ch)
		{
		case ('y'):
			isOptedForTakeAway=true;
			this.price=this.price+backPackPrice;
			break;
		case ('n'):
			isOptedForTakeAway=false;
			break;
		}
	}
	public void bill()
	{
		String bill=" ";
		System.out.println("Pizza :"+basePizzaPrice);
		if(isExtraCheeseAdded)
		{
			bill+="Extra Cheese :"+extraCheesePrice+"\n";
		}
		if(isExtraToppingAdded)
		{
			bill+="Extra Topping :"+extraToppingPrice+"\n";
		}
		if(isOptedForTakeAway)
		{
			bill+="Take Away :"+backPackPrice+"\n";
		}
		bill+="\nTOTAL AMOUNT :"+this.price+"\n";
		System.out.println(bill);
		System.out.println("\n\nTHANKS YOU !!!! VISIT AGAIN.....");
		System.out.println("=======================================");
	}
}
