package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox7 {
	public static void main(String[] args) throws InterruptedException {
		//Question
		//How will u get the totla number of szie if the listbox or dropsdown


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Akash");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("556789");

		driver.findElement(By.id("password_step_input")).sendKeys("ert234");
		String Str = "20/Jun/2005";
		String []date =Str.split("/");
		WebElement Day =driver.findElement(By.id("day"));
		WebElement Month =driver.findElement(By.id("month"));
		WebElement Year =driver.findElement(By.id("year"));
		
		Select S1 = new Select(Day);
		//1
		List<WebElement>S2 =S1.getOptions();
		System.out.println(S2.size());
		//2
		List<WebElement>D1 =driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		int len = D1.size();
		System.out.println(len);
		
		//Question - How will u print all the values
		for(int i=0 ;i<D1.size();i++) {
		String DayValue=D1.get(i).getText();
		System.out.println(DayValue); //1 to 31
		
		//Question 3
		//How will u select specific values from list box
		if(DayValue.equals("15")) {
		D1.get(i).click();
		
		}
		}

		}
		
	
}

