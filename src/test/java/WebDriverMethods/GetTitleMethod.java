package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleMethod {
public static void main(String[] args) {
	
	String Expected_title= "amazon.in";
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

String Actual_title= driver.getTitle();

if(Expected_title.equals(Actual_title)) 
{
	System.out.println("correct title");
}
else {
	System.out.println("incorrect tile");
	
}
driver.close();

}
}
