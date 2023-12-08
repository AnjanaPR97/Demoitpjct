package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Breakfast 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationintesting.online/");


		 WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
		 name.sendKeys("standard_user");
		 
		 WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		 email.sendKeys("anjanaprsep97@gmail.com");
		 
		 WebElement pn=driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		 pn.sendKeys("944736572432");
		 
		 WebElement sub=driver.findElement(By.xpath("//input[@placeholder='Subject']"));
		 sub.sendKeys("secret_sauce123");
		 
		 WebElement msg=driver.findElement(By.xpath("//textarea[@class='form-control']"));
		 msg.sendKeys("secret_sauceregister123");
		 
		 WebElement Submit=driver.findElement(By.xpath("//button[@id='submitContact']"));
		 Submit.click();

	}
	}


