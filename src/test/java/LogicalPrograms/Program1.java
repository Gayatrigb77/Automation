package LogicalPrograms;

public class Program1 {
	public static void main(String[] args) {
		String[] input = { "ERTYU5TYU8", "WERTYUI3RTY9", "WERTY6ZXCV2" };
		// 13, 12 , 8
		for (String str : input) {
		int sum = 0;
		char test[] = str.toCharArray();
		for (char c : test) {
		if (Character.isDigit(c)) {
		sum = sum + Character.getNumericValue(c);
		}
		}
		System.out.println(sum);
		}

		}
}
