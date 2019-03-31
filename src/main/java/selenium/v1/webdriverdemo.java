package selenium.v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class webdriverdemo {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","/home/vidura/wordpress/geckodriver-v0.24.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
		//go to web address
        String baseUrl = "https://www.ustocktrade.com/";
        driver.get(baseUrl);
        
        //click button
        Thread.sleep(15000);
        Select dropdown = new Select(driver.findElement(By.id("country-select")));
        dropdown.selectByVisibleText("United States ");
        
        Thread.sleep(5000);
        
        
        WebElement EmailID = driver.findElement(By.id("menu-item-427"));
        EmailID.click();
        
        //write on textbox
        //Thread.sleep(5000);
        //WebElement firstName = driver.findElement(By.id("firstName"));
        //firstName.sendKeys("Vidura");
       
        
        
      
    }

}