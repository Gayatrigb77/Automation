package TestNgAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class HardAssertions {
	@Test
	public void Test1() {
	System.out.println("Program started");
	boolean actualResult = false;
	Assert.assertTrue(actualResult, "Assertion failed : value should be true");
	System.out.println("Program completed");
	}
	@Test
	public void Test2() {
	System.out.println("Program started");
	boolean actualResult = false;
	Assert.assertFalse(actualResult, "Assertion failed : value should be true");
	System.out.println("Program completed");
	}
	@Test
	public void Test3() {
	System.out.println("Program started");
	String S1 = "Java";
	String S2 = "Java";
	String S3 = "Python";

	Assert.assertEquals(S1, S2, "AssertEqual Failed : Expected Java but found 'python'");
	Assert.assertEquals(S1, S3, "AssertEqual Failed : Expected Java but found 'python'");
	System.out.println("Program completed");
	}
	@Test
	public void Test4() {
	System.out.println("Program started");
	String S1 = "Java";
	String S2 = "Java";
	String S3 = "Python";
	Assert.assertNotEquals(S1, S3, "AssertEqual Failed : Expected Java but found 'python'");

	Assert.assertNotEquals(S1, S3, "AssertEqual Failed : Expected Java but found'python'");

	System.out.println("Program completed");
	}
	}