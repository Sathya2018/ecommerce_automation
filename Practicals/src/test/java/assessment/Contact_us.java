package assessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Contact_us {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    
        //click contact us
        WebElement contactus=driver.findElement(By.cssSelector("a[href=\"/contact_us\"]"));
        contactus.click();
       
        //Enter name 
        driver.findElement(By.name("name")).sendKeys("Sathya");
        //Enter email
        driver.findElement(By.name("email")).sendKeys("sathyaguru8292@gmail.com");
        // Enter subject
        driver.findElement(By.name("subject")).sendKeys("nice products");
        //Enter message
        driver.findElement(By.id("message")).sendKeys("The Quality of the products are good.");
        
        
        //upload file
        driver.findElement(By.name("upload_file")).sendKeys("C:\\testcase");
		
		//click submit
       driver.findElement(By.name("submit")).click();
		
        
        // pop up
        Alert popup=driver.switchTo().alert();
        popup.accept();
        
       //Back to homepage
        driver.findElement(By.xpath("//*[@id=\"form-section\"]/a/span/i")).click();
              
          
	}

}
