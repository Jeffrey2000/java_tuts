
public class Tutorial {
	public static double calculateInterest(int amount, double interestRate) {
		return (amount *(interestRate/100));
	}
	
	public static void main(String[] args) {
		for (int i=2; i <=8; ++i) {
			System.out.println("10000 at an interest rate of " + i + " " +  calculateInterest(10000,i));
		}
	}
	

}
