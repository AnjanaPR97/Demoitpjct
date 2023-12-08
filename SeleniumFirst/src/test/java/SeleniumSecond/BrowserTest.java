package SeleniumSecond;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class BrowserTest 
{
	 WebDriver driver;
	 
  @Test
  public void f() 
  {
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  String browser="chrome";
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  
	  if(browser.equals("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }
	  
	  else if(browser.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
	  }
	  
	           driver.manage().window().maximize();
	           driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
  }

}
