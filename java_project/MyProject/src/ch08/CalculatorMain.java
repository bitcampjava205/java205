package ch08;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calculator = new CalculatorImpl();
		
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.substract(10, 20));
		System.out.println(calculator.multiply(10, 20));
		System.out.println(calculator.divide(10, 20));
		
	}

}
