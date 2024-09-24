package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Cart_login_to_homepage {

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
        
        //open cart page
       WebElement cart=driver.findElement(By.cssSelector("a[href=\"/view_cart\"]"));
       cart.click();
       
       //back to home page
       driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[1]/ol/li[1]/a")).click();
       

	}

}
