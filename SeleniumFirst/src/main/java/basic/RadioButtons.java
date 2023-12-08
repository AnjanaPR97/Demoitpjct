package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();//to set up browser driver
	    WebDriver driver = new ChromeDriver(); //to launch browser
		   
		   driver.manage().window().maximize();
		   driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		   List<WebElement>radbutton=driver.findElements(By.name("student-gender"));
		   radbutton.get(1).click();
		   
		   
		   

	}

}

