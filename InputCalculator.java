import java.util.Scanner;
public class InputCalculator {
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int numbers = 0;
		
		while(true) {
			if(scanner.hasNextInt()) {
				total+=scanner.nextInt();
				numbers++;
			}else {
				System.out.print("SUM = " + total);
				System.out.print(" AVG = " + Math.round((double) total/numbers));
				break;
			}
		}
	}

}
