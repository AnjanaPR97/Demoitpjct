package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown8 
{

	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();//to set up browser driver
    WebDriver driver = new ChromeDriver(); //to launch browser
	   
	   driver.manage().window().maximize();
	   driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	   
	   WebElement colourDropdown=driver.findElement(By.id("single-input-field"));
	   Select oselect=new Select(colourDropdown);
	   oselect.selectByVisibleText("Yellow");
	   //oselect.selectByIndex(3);
	   //oselect.selectByValue("red");
	   
	   
	   
	   //to  get the options in dropdown
	   
	   
	   List<WebElement>dropdownOption=oselect.getOptions();
	   for(int i=0;i<dropdownOption.size();i++)
	   {
		   String s=dropdownOption.get(i).getText();
		   System.out.println("multicolor dropdown"  +i);
		   
	   }
	   
	   WebElement selectedOptions=oselect.getFirstSelectedOption();
	   String s1=selectedOptions.getText();
	   System.out.println("The selected value in single select "  +s1);
	   
	   WebElement multicolor=driver.findElement(By.id("multi-select-field"));
	   Select multiselect=new Select(multicolor);
	   boolean f=multiselect.isMultiple();
	   System.out.println("multicolor option"  +f);
	   
	   multiselect.selectByIndex(0);
	   multiselect.selectByIndex(1);
	   
	   
	   System.out.println("The selected options are " );
	   List<WebElement>optionslist=multiselect.getAllSelectedOptions();
	   
	   for(int i=0;i<optionslist.size();i++)
	   {
		   String s=optionslist.get(i).getText();
		   System.out.println(s);
		   
	   }
	   
	

	}

}
