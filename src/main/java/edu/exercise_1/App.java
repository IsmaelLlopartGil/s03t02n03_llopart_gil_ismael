package edu.exercise_1;

import java.util.HashMap;

public class App {

	private void runScenario() {
		HashMap<String, Float> dollarPriceList = new HashMap<>();
		HashMap<String, Float> yuanPriceList = new HashMap<>();

		dollarPriceList.put("Producte 1", 56.25f);
		dollarPriceList.put("Producte 2", 24.50f);
		dollarPriceList.put("Producte 3", 36.00f);
		dollarPriceList.put("Producte 4", 15.00f);
		dollarPriceList.put("Producte 5", 245.75f);

		yuanPriceList.put("Producte 6", 984.00f);
		yuanPriceList.put("Producte 7", 158.00f);
		yuanPriceList.put("Producte 8", 325.50f);
		yuanPriceList.put("Producte 9", 635.00f);
		yuanPriceList.put("Producte 10", 80.50f);

		PriceIndicator priceIndicator = new PriceIndicator(new DollarToEuroConverter(), dollarPriceList);
		priceIndicator.indicate();

		System.out.println();

		priceIndicator.setPriceList(yuanPriceList);
		priceIndicator.setConverter(new YuanToEuroConverter());
		priceIndicator.indicate();
	}

	public static void main(String[] args) {
		new App().runScenario();
	}
}
