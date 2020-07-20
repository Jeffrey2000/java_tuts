import java.util.*;
public class Tutorial {
	
	public static void main(String[] args) {	
		Car jeffCar = new Car();
		jeffCar.setModel("Tesla");
		System.out.println(jeffCar.getModel());
		
		SimpleCalculator calc = new SimpleCalculator();
		calc.setFirstNumber(5.0);
		calc.setSecondNumber(4);
		System.out.println(calc.getAdditionResult());
		System.out.println(calc.getSubtractionResult());
		calc.setFirstNumber(5.25);
		calc.setSecondNumber(0);
		System.out.println(calc.getMultiplicationResult());
		System.out.println(calc.getDivisionResult());
	}
	
	

	

	
	

}