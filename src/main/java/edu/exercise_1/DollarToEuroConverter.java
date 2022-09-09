package edu.exercise_1;

public class DollarToEuroConverter implements ConverterToEuro {

	@Override
	public float ConvertToEuro(float value) {
		return value*0.99f;
	}
}
