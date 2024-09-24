package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Subscription_in_cartpage {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    
	    //without loggin no products in CART
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	    
	    //Click and enter in the subscription textbox
	    WebElement subscribe=driver.findElement(By.id("susbscribe_email"));
	    subscribe.click();
	    subscribe.sendKeys("sathyaguru@gmail.com");
	    
	    //click subscribe icon
	    driver.findElement(By.xpath("//*[@id=\"subscribe\"]/i")).click();
	}

}
