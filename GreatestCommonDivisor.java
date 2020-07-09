
public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int i, int j) {
		int min = Math.min(i,j);
		if(min < 10) {
			return -1;
		}

		while(min > 0) {
			if(i % min == 0 && j % min ==0) {
				break;
			}
			min--;
		}
		return min;
	}
}
