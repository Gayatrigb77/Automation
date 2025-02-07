package AlertsorPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup3 {
	public static void main(String[] args) throws InterruptedException {
		// Step 1
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();

		String str = "You clicked: Cancel";
		Alert Popup = driver.switchTo().alert();
		Thread.sleep(5000);
		Popup.dismiss();
		String Text =driver.findElement(By.id("result")).getText();
		if(str.equals(Text)) {
		System.out.println("Correct text");

		}
		else {
		System.out.println("Incoorect text");
		}
		}
}
