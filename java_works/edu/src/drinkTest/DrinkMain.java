package drinkTest;

public class DrinkMain {
	private static void displayDrinks(Drinks[] d) {
		// TODO Auto-generated method stub
		for(Drinks v : d) {
			System.out.println(v.drink());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drinks[] drinks = new Drinks[5];
		drinks[0] = new Juice();
		drinks[1] = new Coffee();
		drinks[2] = new Beer();
		drinks[3] = new Water();
		drinks[4] = new Tea();
		
	
		displayDrinks(drinks);
	}
}
