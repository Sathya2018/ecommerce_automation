package assessment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Delete_fromcart  {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //click search bar        
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
        //Enter product name and click search icon
        driver.findElement(By.id("search_product")).sendKeys("kids");
        driver.findElement(By.tagName("button")).click();
        //view product
        driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
        //Add to cart
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
        
        //view cart
        driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]")).click();
        
        //delete product 
       driver.findElement(By.xpath("//*[@id=\"product-13\"]/td[6]/a/i")).click();
       
        
	}

}
