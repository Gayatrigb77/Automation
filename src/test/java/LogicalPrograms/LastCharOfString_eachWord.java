package LogicalPrograms;

public class LastCharOfString_eachWord {
	public static void main(String[] args) {
		String Str2 = " Auto Generated Method Stub ";

		String Str =Str2.trim();
		// A g m s
		Str = Str + " ";
		String Str1 = "";
		for (int i = 0; i < Str.length(); i++) {
		char ch = Str.charAt(i);
		if (Character.isWhitespace(ch)) {
		System.out.print(Str1.charAt(Str1.length()-1)+" ");
		Str1 = "";
		} else {
		Str1 = Str1 + ch;
		}
		}
		}
}
