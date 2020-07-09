import java.util.Stack;

public class NumberToWords {
	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}
		
		if(number <=1) {
			return 1;
		}
		return (int) Math.log10(number) + 1;
	}
	
	public static int reverse(int number) {
		//Stack<Integer> s = new Stack<>();
		boolean switchBack = false;
		
		if(number < 0) {
			number*=-1;
			switchBack = true;
		}
		
		int reverse=0;
		
		
		while(number > 0) {
			reverse*=10;
			int digit = number % 10;
			reverse+=digit;
			number/=10;
		}
		
		if(switchBack) {
			reverse*=-1;
		}
		
		return reverse;
	}
	
	public static void numberToWords(int number) {
		
		int numberDigitCount = getDigitCount(number);
		int reverse = reverse(number);
		int missingZeroes = 0;
		
		if(reverse < 0) {
			System.out.println("Invalid Value");
			return;
		}else if(reverse == 0) {
			System.out.println("Zero");
			return;
		}else {
		
			if(getDigitCount(reverse) < numberDigitCount) {
				missingZeroes = numberDigitCount - getDigitCount(reverse);
			}
			
			String [] numberToString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight","Nine"};
	
			
			while(reverse > 0) {
				int digit = reverse % 10;
				System.out.print(numberToString[digit] + " ");
				reverse/=10;
			}
			
			if(missingZeroes > 0) {
				for(int i=0; i < missingZeroes; ++i) {
					System.out.print("Zero ");
				}
			}
		}
		
		
		
	}
}
