package TestNgAssertions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HardAssertion2 {
	WebDriver driver;
	@BeforeMethod
	@SuppressWarnings("deprecation")
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--headless");
	driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void VerifryPageTitle() {
	WebElement Username = driver.findElement(By.name("username"));
	WebElement Password = driver.findElement(By.name("password"));
	// Assert true
	Assert.assertTrue(Username.isDisplayed(), "Asserton failed : username field is not displayed");

	Username.sendKeys("Admin");
	Assert.assertTrue(Password.isDisplayed(), "Asserton failed : Password field is not displayed");

	Password.sendKeys("admin123");


	String ExpTitle = "OrangeHRM1";
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String ActTitle = driver.getTitle();
	Assert.assertEquals(ActTitle, ExpTitle, "Assertion failed : Webpage title does not matche the expected title");
	}
	@AfterMethod
	public void Teardown() {
	driver.quit();
	}
}
