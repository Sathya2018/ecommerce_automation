package assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Search_continueshopping {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	   
	    //with login
	    WebElement login=driver.findElement(By.cssSelector("a[href=\'/login\']"));
	    login.click();
		//email
	    WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
	    email.click();
	    email.sendKeys("sathya780@gmail.com");
	    //password
	    WebElement password=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
	    password.click();
	    password.sendKeys("ammu23.");
	    //Login
	    WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        loginbutton.click();
		
         //clicking the product menu
      	WebElement product=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i"));
      	product.click();
      		
      	//select search
      	driver.findElement(By.cssSelector("input#search_product")).sendKeys("SAREE");
      		
      	//click the search button
      	WebElement search=driver.findElement(By.cssSelector("button[type='button']"));
      	search.click();
      		
      	//clicking view product
      	WebElement viewproduct=driver.findElement(By.linkText("View Product"));
      	viewproduct.click();
      		
      	//add to cart
      	WebElement addcart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
      	addcart.click();
      		
      	//continue shopping
      	WebElement continueshopping=driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));
      	continueshopping.click();
	   
		
		

}
}