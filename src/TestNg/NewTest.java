package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void MyTest() {
	  driver.navigate().to("https://www.google.com");
	  System.out.println("This is change in method");
	  assertEquals("true", "false");
  }

  @BeforeTest
  public void StartBrowser() {
	  driver = new ChromeDriver();
	  driver.manage().window();
  }

  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }

}
