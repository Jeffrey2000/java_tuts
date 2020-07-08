
public class Tutorial {
	
	public static void main(String[] args) {
		System.out.println(sumDigits(123));
	}
	
	
	public static int sumDigits(int number) {
		int rem, t = 0;
		int p = 1;
		if (number > 10) {
			while (number > 0) {
				rem = number % (int)(Math.pow(10,p));
				//A bit hacky here, this is used so often but I often forget
				// The logic
				t+= rem * 10 / Math.pow(10,p);
				p++;
				number-=rem;
			}
		}else {
			t = -1;
		}
		return t;

	}
	
	//both solutions are O(n) however my solution has more constant operations and is less space efficient
	public static int Solution(int number) {
		if(number < 10) {
			return -1;
		}
		
		int sum = 0;
		//Use n = n/10 to extract digit
		// Use n % 10 to obtain last digit
		while (number > 0) {
			 int digit = number % 10;
			 sum+=digit;
			 //discard number
			 number /= 10;
		}
		return sum;
		
	}
		
	

	
	

	
	

}