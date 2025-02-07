package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/login.php/?lang=en-US");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.quit();
}
}
