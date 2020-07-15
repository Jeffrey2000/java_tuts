
public class LargestPrime {
	public static int getLargestPrime(int number) {
		if(number <=0) return -1;
		int maxPrime = -1;
		
		while(number % 2 == 0) {
			maxPrime = 2;
			number >>= 1;
		}
		
		//2n+3 linear sequence
		for(int i =3; i<= Math.sqrt(number); i+=2) {
			while (number % i == 0) { //this finds factor of the number
				maxPrime = i;
				number = number / i; 
			}
		}
		
		if(number > 2)
			maxPrime = number;
		return maxPrime;
	}
}
