package Automation1.Test;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MavenTest {
WebDriver driver;
	
	

	//@SuppressWarnings("deprecation")
	@BeforeClass()
	void getUser() {
		System.setProperty("webdriver.chrome.driver", "D:\\file\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.optus.com.au/mobile/phones");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	@Test(invocationCount=5)
     void TestTitle() {
		String abc=driver.getTitle();
		System.out.println(abc);
		Assert.assertEquals(abc, "Mobile Phones | Optus");
    	 
     }
	@Test(priority=2)
	void TestTabs() {

}
}