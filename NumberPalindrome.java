
public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int tempNumber = number;
		if(tempNumber < 0) { //checking for negative numbers
			tempNumber*=-1; //changing the sign on negative numbers
							//this does not affect the outcome
			number*=-1;
		}
		while(tempNumber > 0) {
			reverse*=10; 
			int digit = tempNumber% 10; //Get the last digit
			reverse+=digit; //Add to the reverse integer this last digit
			tempNumber/=10; //Discard the last digit
		}
		return (reverse == number);
	}
}
