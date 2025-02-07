package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetSizeMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/?lang=en-US");
	driver.manage().window().maximize();
	  
	Dimension D2= new Dimension(200, 400);
	driver.manage().window().setSize(D2);
	Thread.sleep(2000);
	driver.quit();
}
}
