package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.RegisterPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Registertest 
{
	 WebDriver driver;
  @Test
  public void f() 
  {
	  
	  SoftAssert s=new SoftAssert();
	  RegisterPage obj=new RegisterPage();
	 String actualtext= obj.doregister();
	 String expected="sign-in";
	  s.assertEquals(actualtext, expected);
      s.assertAll();
  }
  
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php/");
		
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
