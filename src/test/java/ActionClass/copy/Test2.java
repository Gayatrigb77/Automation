package ActionClass.copy;

public class Test2 {
	public static void main(String[] args) {
		
		int a = 1;
		int b = a++; // postincrement
		System.out.println(a); // 1
	System.out.println(b); // 1

	// int t = 10;
	// int r = ++t + t++; //11 + 11
	//
	// System.out.println(t); //10 //10
	// System.out.println(r); //11 //21
	//


	int i = 10;
	int j = ++i + ++i;
	System.out.println(i); // 12
	System.out.println(j); // 22
	Integer M1 = 100;
	Integer M2 = 100;
	System.out.println(M1 == M2);
	Integer M3 = 20;
	Integer M4 = 30;
	System.out.println(M3 == M4);
	Integer M33 = 200;
	Integer M43 = 200;
	System.out.println(M33 == M43);
	Integer I1 = new Integer(200);
	Integer I2 = new Integer(200);
	System.out.println(I1 == I2);
	System.out.println(I1.equals(I2));

	}
}
