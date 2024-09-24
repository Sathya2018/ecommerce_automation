package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Search_by_category {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    
	    //Navigate to login page
	    WebElement login=driver.findElement(By.cssSelector("a[href=\'/login\']"));
	    login.click();
	    
		// Enter email
	    WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
	    email.click();
	    email.sendKeys("sathya780@gmail.com");
	    //Enter password
	    WebElement password=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
	    password.click();
	    password.sendKeys("ammu23.");
	    //click Login button
	    WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        loginbutton.click();
        
        //women category
      	WebElement women=driver.findElement(By.xpath("//*[@id=\'accordian\']/div[1]/div[1]/h4/a/span"));
      	women.click();
      		
      	//dress option
      	WebElement dress=driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a"));
      	dress.click();
      		
      	//add to cart
      	WebElement add=driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[1]/div[1]/a"));
      	add.click();
      		
      	//view cart
      	driver.findElement(By.xpath("//*[@id=\'cartModal\']/div/div/div[2]/p[2]/a")).click();
       
	}

}
