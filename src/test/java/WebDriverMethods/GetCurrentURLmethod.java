package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class GetCurrentURLmethod {
 public static void main(String[] args) {
	 
	 String exp_url ="https://www.amazon.in/";
	 ChromeDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/login.php/?lang=en-US");
	 driver.manage().window().maximize();
	
	 String url=driver.getCurrentUrl();
	 if(exp_url.equals(url)) {
		System.out.println("correct url"); 
	 }
	 else {
		 System.out.println("incorrect url");
	 }
	 driver.close();
}
}
