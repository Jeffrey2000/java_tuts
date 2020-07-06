
public class Tutorial {
	
	public static void main(String[] args) {
		int total = 0;
		int count =  0;
		for (int i=1;i<=1000;++i) {
			//Can easily add some logic here to avoid break statement in for loops
			//Always considered break statement to belong to the while loop construct
			if(i%3==0 && i%5==0 && count < 5) {
				System.out.println(i + " is a mulitple of 3 and 5");
				total+=i;
				count+=1;
			}
		}
		
		System.out.println("The total is " + total);
	}
}