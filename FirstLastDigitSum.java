
public class FirstLastDigitSum {
	public static void sumFirstLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		
		int last = number % 10;
		int first = 0;
		while(number > 0) {
			first = number %10;
			number/=10;
		}
		System.out.println("First " + first + " Last" +  last);
	}
}
