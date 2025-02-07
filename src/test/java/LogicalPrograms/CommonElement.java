package LogicalPrograms;

public class CommonElement {
	public static void main(String[] args) {
		String str1 []= {"Java", "Test","Python","C#"};
		String str2 []= {"Java", "Test1","Python1","C#1"};
		for(int i=0 ;i<str1.length ;i++) {
		for(int j=0;j<str2.length;j++) {
		if(str1 [i] == str2[j] ) {
		System.out.println(str1[i]);
		}
		}
		}
		}
}
