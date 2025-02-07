package LogicalPrograms;

public class SeconfHighestnumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 7 };
		int largest = 0;
		int secondLarge = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
		if (arr[i] > largest) {
		secondLarge = largest; //1
		largest = arr[i]; //1
		}
		}
		System.out.println("Second largest number in array: " +

		secondLarge);
		}
		
}
