package Selenium;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 


public class demo1 {
	
	

	public static void main(String[] args) {
		ChromeOptions co= new ChromeOptions(); 
		co.setBrowserVersion("117");

	WebDriver driver = new ChromeDriver(); 
	driver.get("https://www.amazon.in/"); 
	}

	}

