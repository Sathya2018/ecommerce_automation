package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Logout {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    
	    //click login
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
        
        //click log out
       WebElement logout=driver.findElement(By.cssSelector("a[href='/logout']"));
       logout.click();
	}
}