package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/login.php/?lang=en-US");
	 driver.manage().window().maximize();
	 Thread.sleep(200);
	 driver.findElement(By.xpath("https://www.facebook.com/r.php?locale=en_GB&display=page")).click();
	 Thread.sleep(2000);
	 driver.quit();
}
}
