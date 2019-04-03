package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		// TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
		Calculator calc = new CalculatorImpl();
		
		calc.addValue(20);
		calc.addValue(4);
		calc.addValue(16);


		// add other integers
		calc.addValue(17);
		calc.addValue(-4);
		// output lowest number 
		System.out.println("Min: " + calc.getMinimum());
		// output highest number
		
		// output sum of all numbers
		System.out.println("Sum: " + calc.sum());
	}

}
