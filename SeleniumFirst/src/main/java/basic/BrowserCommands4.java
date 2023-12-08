package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands4 {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();//to set up browser driver
		
           WebDriver driver = new ChromeDriver(); //to launch browser
           driver.get("https://www.practicemock.com/");//Launch the url
           
        String title=driver.getTitle();//get title of the page
        System.out.println("Title of page is "+title);
        
        String url=driver.getCurrentUrl();//get the current url in the webpage
        System.out.println("url of page is "+url);
        String ps=driver.getPageSource();//get the html code
       // System.out.println("pagesource of page is "+ps);// driver.close();// close the current tabdriver
        
        
      }

}
