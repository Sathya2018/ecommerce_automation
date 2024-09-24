package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Subscription_in_homepage{

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	   
        //Click and enter in the subscription textbox
	    WebElement subscribe=driver.findElement(By.id("susbscribe_email"));
	    subscribe.click();
	    subscribe.sendKeys("sathyaguru@gmail.com");
	    //click subscription icon
	    driver.findElement(By.xpath("//*[@id=\"subscribe\"]/i")).click();

	}

}
