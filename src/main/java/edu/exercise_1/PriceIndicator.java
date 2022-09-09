package edu.exercise_1;

import java.util.HashMap;

public class PriceIndicator {

	private ConverterToEuro converter;
	private HashMap<String, Float> priceList;

	public PriceIndicator(ConverterToEuro converter, HashMap<String, Float> priceList) {
		this.converter = converter;
		this.priceList = priceList;
	}

	public void indicate() {

		priceList.forEach(
				(k, v) -> System.out.println("Producte: " + k + "  Preu: " + converter.ConvertToEuro(v) + " Euros"));
	}

	public void setConverter(ConverterToEuro converter) {
		this.converter = converter;
	}

	public void setPriceList(HashMap<String, Float> priceList) {
		this.priceList = priceList;
	}
}
