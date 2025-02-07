package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		//Step 1

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Text1 =driver.findElement(By.xpath("(//a[@class=\"nav-a\"])[2]"));

//		if(Text1.isDisplayed()) {
//		System.out.println("The text is visible");
//		}
//		else {
//		System.out.println("The text is not visible");
//		}
	WebElement Text2 =driver.findElement(By.xpath("(//a[@class=\"nav-a\"])[23]"));

		if(Text2.isDisplayed()) {
		System.out.println("The text2 is visible");
	}
		else {
		System.out.println("The text2 is not visible");
		}
		driver.quit();
		}
	
		
}
