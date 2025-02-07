package AlertsorPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup5 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		String str = "Please enter your password";
		Thread.sleep(4000);
		Alert Alt =driver.switchTo().alert();
		String Text =Alt.getText();
		Alt.accept();
		if(Text.equals(str)) {
		System.out.println("Correct text");
		}
		else {
		System.out.println("Incorrect text");
		}
		driver.close();
			
	}
	}
