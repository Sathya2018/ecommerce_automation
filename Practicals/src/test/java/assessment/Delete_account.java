package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Delete_account {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    
	   //Login page

	    WebElement login=driver.findElement(By.cssSelector("a[href=\'/login\']"));
	    login.click();
		//Enter email
	    WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
	    email.click();
	    email.sendKeys("sathya780@gmail.com");
	    //Enter password
	    WebElement password=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
	    password.click();
	    password.sendKeys("ammu23.");
	    //click Login
	    WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        loginbutton.click();
	    
	    
	    //Delete account
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	    
	    // click continue
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
	    
	}

}
