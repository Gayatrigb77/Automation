package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFRAME3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

		WebElement OuterFrame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));

		driver.switchTo().frame(OuterFrame);
		WebElement Text = driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]"));
		String T1 = Text.getText();
		if (T1.equals("Nested iFrames")) {
		System.out.println("Correct text");
		} else {
		System.out.println("Incorrect text");
		}
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

		driver.switchTo().frame(innerframe);
		WebElement Text2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Text2.sendKeys("Automation testing");
		driver.switchTo().parentFrame();
		String T2 = Text.getText();

		

		System.out.println(T2);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

		}
		}