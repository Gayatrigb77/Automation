package LogicalPrograms;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String S1 = "race";
		String S2 = "carU";

		String S3 = "java";
		String S4= "avaj";
		//check the length is same
		if(S1.length() == S2.length()) {
		//covert String to chararray
		char[] C1 =S1.toCharArray();
		char[] C2 = S2.toCharArray();
		Arrays.sort(C1);
		Arrays.sort(C2);
		boolean result =Arrays.equals(C1, C2);
		if(result) {
		System.out.println(S1 + " and " +S2 +" are anagram string");

		}
		else {
		System.out.println(S1 + " and " +S2 +" are not anagram string");

		}
		}
		}
}
