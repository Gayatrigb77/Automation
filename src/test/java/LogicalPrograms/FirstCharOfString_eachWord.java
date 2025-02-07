package LogicalPrograms;

public class FirstCharOfString_eachWord {
	public static void main(String[] args) {
		String Str = "Auto Generated Method Stub";
		// A g m s
		Str = Str + " ";
		String Str1 = "";
		for (int i = 0; i < Str.length(); i++) {
		char ch = Str.charAt(i);
		if (Character.isWhitespace(ch)) {
		System.out.print(Str1.charAt(0)+" ");
		Str1 = "";
		} else {
		Str1 = Str1 + ch;
		}
		}
		}
}
