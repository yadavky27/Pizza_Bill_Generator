package krishna.com;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("==========WELCOME TO PIZZAMANIA==========");
		System.out.println("Please select type of pizza");
		System.out.println(" 1. VEG PIZZA \n 2. NON-VEG PIZZA \n 3. DELUX VEG PIZZA \n 4. DELUX NON-VEG PIZZA");
	System.out.println("Select anyone =>");
	
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			pizza vegPizza=new pizza(true);
			vegPizza.addExtraCheese();
			vegPizza.addExtraTopping();
			vegPizza.takeAway();
			vegPizza.bill();
			break;
			
		case 2:
			
			pizza nonvegPizza=new pizza(false);
			nonvegPizza.addExtraCheese();
			nonvegPizza.addExtraTopping();
			nonvegPizza.takeAway();
			nonvegPizza.bill();
			break;
			
		case 3:
			DeluxPizza veg=new DeluxPizza(true);
			veg.basePizzaPrice=550;
			veg.addExtraCheese();
			veg.addExtraTopping();
			veg.takeAway();
			veg.bill();
			break;
			
		case 4:
		
			DeluxPizza nonveg=new DeluxPizza(false);
			nonveg.basePizzaPrice=650;
			nonveg.addExtraCheese();
			nonveg.addExtraTopping();
			nonveg.takeAway();
			nonveg.bill();
			break;
			
			default:
				System.out.println("Sorry please enter again !!!!");
				return;
		}
		sc.close();
	}

}
