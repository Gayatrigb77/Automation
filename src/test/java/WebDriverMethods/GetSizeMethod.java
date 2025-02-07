package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSizeMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/?lang=en-US");
	Dimension d1= new Dimension(200, 200);
	driver.manage().window().setSize(d1);
	Thread.sleep(2000);
	System.out.println(driver.manage().window().getSize());
	Dimension Test= driver.manage().window().getSize();
	System.out.println(Test);
	driver.close();
}
}
