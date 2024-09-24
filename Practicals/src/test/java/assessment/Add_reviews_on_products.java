package assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Add_reviews_on_products {

	public static void main(String[] args) {
		
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
        
        //write name,email and review
        driver.findElement(By.id("name")).sendKeys("sathya");
        driver.findElement(By.id("email")).sendKeys("sathyaguru@gmail.com");
        driver.findElement(By.id("review")).sendKeys("nice products");
        //click submit
        driver.findElement(By.id("button-review")).click();

	}

}
