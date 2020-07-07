import java.util.Arrays;

public class sortingAlgorithms {
	
	public static void main(String[] args) {
		int [] numbers = {2,9,1,4,3,26,10};
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void insertionSort(int[] numbers) {
		for (int i=0;i < numbers.length - 1; i++) {
			
			//Moving greater elements along in the array
			int key = numbers[i];
			int j = i -1;
			
			System.out.println("This is the value of i" + i + "\n This is key " + key);
			while (j >=0 && key < numbers[j]) {
				numbers[j+1] = numbers[j];
				j-=1;
			}
			numbers[j+1] = key;
		}
		
	}
}


