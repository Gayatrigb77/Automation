package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetPositionMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/?lang=en-US");
	driver.manage().window().maximize();
	Point p1= new Point(600,200);
	driver.manage().window().setPosition(p1);
	Thread.sleep(5000);
	System.out.println(driver.manage().window().getPosition());
	Point test =driver.manage().window().getPosition();
	Thread.sleep(2000);
	driver.close();
}
}
