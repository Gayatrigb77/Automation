package LogicalPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// 123 = 1^3 = 1
		// 2^3 = 8
		// 3^3 = 27 = 36
		// 153 - 1^1 =1 5^3 = 125 - 3^3 - 27
		int Sum, num ,Rem ,OrignialNumber;
		num = 153 ;
		OrignialNumber = 153 ;
		for (Sum = 0; num > 0; num = num / 10) { //True 15>0 - trye
		Rem = num % 10; // 3 2 1 153%10 - 3 15%10 - 5 1
		Sum = Sum +Rem*Rem*Rem;
		//0=0+3*3*3 =27
		//27=27+5*5*5 = 27+125 = 153

		}
		if (Sum == OrignialNumber) {
		System.out.println("ArmstrongNumber number");
		} else {
		System.out.println("Not ArmstrongNumber number");
		}
		}
}
