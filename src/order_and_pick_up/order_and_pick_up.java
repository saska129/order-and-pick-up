package order_and_pick_up;

import java.util.Scanner;

public class order_and_pick_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] ingredients = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
				"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix",
				"Pecurke", "Kutija" };
		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		double totalPrice = 0;
		String phone = "0";

		System.out.println("Izvolite!");
		System.out.print("Izaberite sastojke za pastu: ");
		String ingredientName = "";
		ingredientName = s.nextLine();
		while (!ingredientName.equals("Poruci")) {
			if(isValid(ingredients, ingredientName)) {
				int priceIndex = findIngredient(ingredients, ingredientName);
				totalPrice = totalPrice + price[priceIndex];
				System.out.print("Izaberite sastojke za pastu: ");
				ingredientName = s.nextLine();
			} else {
				System.out.print("Zeljeni sastojak nemamo u ponudi. Molimo vas izaberite ponovo: ");
				ingredientName = s.nextLine();
			}
			
			}
		System.out.print("Unesite vas broj telefona: ");
		phone = s.next();
		if (isRegularCustomer(phoneNumbers, phone)) {
			totalPrice=0.9*totalPrice;
		}
		
		System.out.println("Vasa pasta iznosi " + totalPrice);
		System.out.println("Prijatno!");

	}
	public static int findIngredient(String[] ingredients, String ingredientName) {
		int priceIndex = -1;
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredientName)) {
				priceIndex = i;
			}
		}
		return priceIndex;
}
	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {
		boolean b = false;
		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phoneNumbers[i].equals(phone)) {
					b = true;
				}
			}
			return b;
}
	public static boolean isValid(String[] ingredients, String ingredientName) {
		boolean b = false;
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredientName)) {
				b = true;
			}
		}
		return b;
}
}