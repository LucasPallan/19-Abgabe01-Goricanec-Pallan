package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		// TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
		Calculator calc = new CalculatorImpl();
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowester number
		calc.addValue(16);

		// add other integers
		calc.addValue(140);
		calc.addValue(30);
		calc.addValue(1000);
		calc.addValue(-3);

		// output lowest number 
		
		// output highest number
		System.out.println("Max: " + calc.getMaximum());
		// output sum of all numbers
		System.out.println("Sum: " + calc.sum());
	}
}
