
public class FactorPrinter {
	public static void printFactors(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
			return;
		}else if(number == 1) {
			System.out.print(1);
			return;
		}else {
			for(int i =1; i < Math.ceil(number/2) + 1; ++i) {
				if(number % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.print(number);
		}
	}
}
