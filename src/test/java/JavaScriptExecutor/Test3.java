package JavaScriptExecutor;

public class Test3 {
	public static void main(String[] args) {

		String Str = "Java_Automation_Python";
		String [] T1 =Str.split("_");
		System.out.println(T1[0]); // Java
		System.out.println(T1[0].length()); //4
		String Str1 = "_va_Automation_Python";
		String []T2 = Str1.split("_");
		System.out.println(T2[0]); //Ja
		System.out.println(T2[0].length());//0
		System.out.println(T2[1]); //vaautomation
		System.out.println(T2[1].length()); //

		}
}
