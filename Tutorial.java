
public class Tutorial {
	public static double calculateInterest(int amount, double interestRate) {
		return (amount *(interestRate/100));
	}
	
	public static void main(String[] args) {
		for (int i=2; i <=8; ++i) {
			System.out.println("10000 at an interest rate of " + i + "% " +  calculateInterest(10000,i));
		}
		
		System.out.println("Going backwards");
		
		for (int i=8; i >=2; --i) {
			System.out.println("10000 at an interest rate of " + i + "% " +  calculateInterest(10000,i));
		}
		
		int count = 0;
		
		for(int i=20; i >=1; --i) {
			if(count==3) {
				break;
			}else {
				if(isPrime(i)) {
					count+=1;
					System.out.println(i + " is a prime number");
				}
			}
		}
		
	}
	
	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}else {
			for(int i=2; i < number/2; i++) {
				if(number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	

}
