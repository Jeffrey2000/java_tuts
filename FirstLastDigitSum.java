
public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		int last = number % 10; //can be accessed in constant time
		int first = 0;
		while(number > 0) { //makes sense for this to be a linear time alg, since we wouldn't know the place value of the number beforehand
			first = number %10;
			number/=10;
		}
		return first + last;
		//System.out.println("First " + first + " Last" +  last);
	}
}
