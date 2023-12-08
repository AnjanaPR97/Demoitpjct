package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicemock {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.practicemock.com/");
		 
		 WebElement firstName=driver.findElement(By.xpath("//input[@id='course-uemail']"));
		 firstName.sendKeys("rethydevipillaip@gmail.com");
		 
		
		

	}

}
