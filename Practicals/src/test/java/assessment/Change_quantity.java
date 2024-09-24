package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Change_quantity {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	           
        //Home page
        driver.findElement(By.xpath("/html/body/section[2]/div[1]/div[1]/div[2]/div[1]/div[8]/div/div[2]/ul/li/a")).click();
        
        //change quantity
        WebElement quantity=driver.findElement(By.id("quantity"));
        quantity.clear();
        quantity.sendKeys("5");
       
        //add to cart
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
        
        

	}

}
