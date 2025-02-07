package ActionClass.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction2 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://the-internet.herokuapp.com/key_presses?");
	Actions act = new Actions(driver);
	act.keyDown(Keys.BACK_SPACE).perform();

	act.keyDown(Keys.DELETE).perform();
	// boolean test=driver.findElement(By.id("id=\"result\"")).isDisplayed();
	// System.out.println(test);
	Thread.sleep(2000);
	act.keyDown(Keys.SHIFT).perform();
	Thread.sleep(2000);
	act.keyDown(Keys.TAB).perform();
	Thread.sleep(2000);
	act.keyDown(Keys.ESCAPE).perform();

	Thread.sleep(2000);
	act.keyDown(Keys.SPACE).perform();
	Thread.sleep(2000);
	act.keyDown(Keys.CONTROL).perform();
	driver.quit();

}
}