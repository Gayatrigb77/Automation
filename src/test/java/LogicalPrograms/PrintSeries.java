package LogicalPrograms;

public class PrintSeries {
	public static void main(String[] args) {
		//without loop
		int n =5;
		printNumber(1, n);
		}
		public static void printNumber(int currentnumber ,int number) {
		if(currentnumber > number) {
		return;
		}
		System.out.println(currentnumber+ " "); //
		printNumber(currentnumber+1, number); //Recursive call for the number
		}
}
