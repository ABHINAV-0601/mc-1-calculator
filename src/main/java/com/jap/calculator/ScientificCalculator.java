package com.jap.calculator;
import java.lang.Math;
public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num <= 0){
			throw new CalculatorException("Please enter a number greater than zero");
		}
		//or else call ceil method of Math class and return the value
		else{
			return Math.ceil(num);
		}
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num <= 0){
			throw new CalculatorException("Please enter a number greater than zero");
		}
		//or else call floor method of Math class and return the value
		else{
			return Math.floor(num);
		}
	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		if(num1 < num2){
			throw new CalculatorException("Please enter first number greater than second number");
		}
		//else use Math pow method and return the value
		else{
			long result = (long)Math.pow(num1,num2);
			return result;
		}
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if(num <= 0){
			throw new CalculatorException("Please enter a number greater than zero");
		}
			//or else call sqrt method of Math class and return the value
		else{
			return Math.sqrt(num);
		}
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println(scientificCalculator.cielOfANumber(2.5f));

		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			System.out.println(scientificCalculator.floorOfANumber(2.5f));

		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		try {
			System.out.println(scientificCalculator.power(10,5));

		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		try {
			System.out.println(scientificCalculator.squareRoot(10));

		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
	}
}
