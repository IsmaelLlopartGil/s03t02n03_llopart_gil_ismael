package edu.exercise_1;

public class YuanToEuroConverter implements ConverterToEuro {

	@Override
	public float ConvertToEuro(float value) {
		return value * 0.14f;
	}
}
