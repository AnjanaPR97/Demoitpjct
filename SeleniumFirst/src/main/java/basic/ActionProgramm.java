package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionProgramm {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		
		 WebElement dragelement=driver.findElement(By.id("draggable"));
		 WebElement dropelement=driver.findElement(By.id("droppable"));
		 
		 Actions actions=new  Actions (driver);
		 actions.dragAndDrop(dragelement, dropelement).perform();
		 driver.switchTo().defaultContent();
		
		
		
		

		
		

	}

}
