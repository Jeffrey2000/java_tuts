
public class SharedDigit {
	public static boolean hasSharedDigit(int i, int j) {
		if((10 > i || i >= 99 ) || (10 >= j || j > 99)) {
			return false;
		}
		
		int tempJ = j;
		while (i > 0) {
			int iDigit = i % 10;
			j = tempJ;
			while (j > 0) {
				int jDigit = j % 10;
				System.out.println("Comparing " + iDigit + "against " + jDigit);
				if (iDigit == jDigit) {
					return true;
				}
				j/=10;
			}
			i/=10;
			System.out.println("i " + i);

		}
		return false;
		
	}
}
