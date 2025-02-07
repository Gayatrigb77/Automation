package LogicalPrograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		//4 ,400, 100
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		if(((year % 4 == 0) && (year %100 != 0)) || (year % 400 == 0)) {
		System.out.println("Give year is a leap year");
		}
		else {
		System.out.println("Give year is not a leap year");
		}
		int input [] = {1,4,0,6,4,0,5,0,1,2,0,4,0};
		//expected o/p = 0,0,0,0,0,1,4,6,4,5,1,2,4
		}
}
