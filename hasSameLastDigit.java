
public class hasSameLastDigit {
	
	public static boolean isValid(int number) {
		return (number >= 10 && number <= 1000);
	}
	
	public static boolean hasSameLastDigit(int i, int j, int k) {
		if(isValid(i) && isValid(j) && isValid(k)) {
			return (i % 10) == (j%10) || (i%10) == (k%10) || (j%10 == k%10);
		}
		return false;
	}
}
