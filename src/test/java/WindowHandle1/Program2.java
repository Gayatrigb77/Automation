package WindowHandle1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM,Inc')]")).click();

		Thread.sleep(3000);
		String WinID = driver.getWindowHandle();
		// It is use ti store only curent window IDs in the formof string
		System.out.println(WinID);
		// 2. GetWindowHanldes
		Set<String> WinIDs = driver.getWindowHandles();
		//First way

		// Iterator<String> Test = WinIDs.iterator();
		//
		
		// System.out.println(ParentWindow);
		// System.out.println(Childwindow);
		//
		// driver.switchTo().window(Childwindow);

		//SecondWay
		List<String> WinList = new ArrayList<String>(WinIDs);
		String ParentWIndow =WinList.get(0);
		String Childwondow = WinList.get(1);
		driver.switchTo().window(Childwondow);
		String Title =driver.getTitle();
		System.out.println(Title);

		//
		//
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Test@gmail.com");
		//
		driver.findElement(By.id("Form_submitForm_action_request")).click();

		Thread.sleep(3000);
		driver.switchTo().window(ParentWIndow);
		String Title1 =driver.getTitle();
		System.out.println(Title1);
		driver.quit();		
}}

