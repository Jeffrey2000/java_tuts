
public class SumOddRange {
	public static boolean isOdd(int number) {
		return (number%2!=0 && number > 0);
	}
	
	public static int sumOdd(int start, int end) {
		int total = 0;
		if (start > 0 && end > 0 && start <= end) {
			for (int i=start; i<=end; i++) {
				if(isOdd((i))) {
					total+=i;
				}
			}
		}else {
			total = -1;
		}
		
		return total;
	}
}
