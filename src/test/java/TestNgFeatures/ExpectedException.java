package TestNgFeatures;

public class ExpectedException {
	@org.testng.annotations.Test(expectedExceptions = ArithmeticException.class)
	public void Test() {
	System.out.println("Hello");
	System.out.println(10/0);
	}
}
