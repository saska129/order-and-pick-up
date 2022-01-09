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
}