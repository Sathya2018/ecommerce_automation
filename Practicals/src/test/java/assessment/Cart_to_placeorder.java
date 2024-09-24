package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Cart_to_placeorder {

	public static void main(String[] args)
	{
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
        
                
        // click Cart page
       WebElement cart=driver.findElement(By.cssSelector("a[href=\"/view_cart\"]"));
       cart.click();
       //proceed for payment
       driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
       //place order
       driver.findElement(By.linkText("Place Order")).click();
       
       //payment
       
       //Enter name on card
       driver.findElement(By.name("name_on_card")).sendKeys("Hema");
       //Enter card no
       WebElement cardnumber=driver.findElement(By.cssSelector("input[name='card_number']"));
       cardnumber.sendKeys("895623");
       //Enter CVV
       WebElement cvv=driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
       cvv.sendKeys("563");
       //Enter month
       driver.findElement(By.name("expiry_month")).sendKeys("09");
       //Enter year
       WebElement year=driver.findElement(By.cssSelector("input[name=\"expiry_year\"]"));
       year.sendKeys("2030");
       
       // click pay and confirm order
       driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
       
       //click continue
       driver.findElement(By.tagName("continue-button")).click();
	}

}
