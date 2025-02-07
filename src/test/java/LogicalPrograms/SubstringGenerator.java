package LogicalPrograms;

public class SubstringGenerator {
	public static void main(String[] args) {
		SubstringGenerator.getSubstring("Test");
		}
		public static void getSubstring(String str) {
		for (int i = 0; i < str.length(); i++) {
		for (int j = i + 1; j <= str.length(); j++) {
		System.out.println(str.substring(i, j) + ", ");
		}
		}
		}
}
