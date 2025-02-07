package ExceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement Ele = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));

		Ele.click();
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Accessories')]")).isDisplayed();
		driver.navigate().back();
		try {
		Ele.click();
		} catch (StaleElementReferenceException e) {
		WebElement Eleq = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));

		System.out.println("Hello");
		Eleq.click();
		}
		driver.close();
		}
}
