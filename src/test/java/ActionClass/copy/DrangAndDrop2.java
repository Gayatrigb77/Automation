package ActionClass.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrangAndDrop2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement Ele = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
	driver.switchTo().frame(Ele);
	WebElement Src = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));

	WebElement dest = driver.findElement(By.id("trash"));
	Actions Act = new Actions(driver);
	Act.dragAndDrop(Src, dest).perform();
	}

}
