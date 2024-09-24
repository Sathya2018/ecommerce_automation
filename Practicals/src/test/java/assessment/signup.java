package assessment;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class signup 
{
 public static void main(String[] args)  throws InterruptedIOException
	{
	WebDriver driver=new EdgeDriver();	
	driver.get("https://automationexercise.com/");
    driver.manage().window().maximize();
    
    //click signup
	WebElement login=driver.findElement(By.cssSelector("a[href=\'/login\']"));
    login.click();
    //name
    WebElement name=driver.findElement(By.cssSelector("input[placeholder='Name']"));
    name.click();
    name.sendKeys("Sathya");
    //email
    WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
    email.click();
    email.sendKeys("sathya780@gmail.com");
    WebElement signup=driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[3]/div/form/button"));
    signup.click();
    //gender
    driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
    //password
    WebElement password=driver.findElement(By.id("password"));
    password.click();
    password.sendKeys("ammu23.");
    //date of birth   
	WebElement drpdays=driver.findElement(By.id("days"));
	Select drpdaysvalue=new Select(drpdays);
	drpdaysvalue.selectByValue("4"); 
	
	WebElement drpmonth=driver.findElement(By.id("months"));
	Select drpmonthvalue=new Select (drpmonth);
    drpmonthvalue.selectByVisibleText("February");
    
    WebElement drpyear=driver.findElement(By.id("years"));
	Select drpyearvalue=new Select (drpyear);
    drpyearvalue.selectByValue("2000");
    
    //sign up for our newsletter
    WebElement newsletter=driver.findElement(By.xpath("//*[@id=\'newsletter\']"));
    newsletter.click();
    boolean news=newsletter.isSelected();
    //Receive special offers from our partners
    WebElement specialoffers=driver.findElement(By.xpath("//*[@id=\"optin\"]"));
    specialoffers.click();
    boolean offers=specialoffers.isSelected();
    
    //first name  
    WebElement firstname=driver.findElement(By.id("first_name"));
    firstname.click();
    firstname.sendKeys("Sathya");
    //last name
    WebElement lastname=driver.findElement(By.id("last_name"));
    lastname.click();
    lastname.sendKeys("Pandiyan");
    //company name
    WebElement company=driver.findElement(By.id("company"));
    company.sendKeys("Automation Exercise");
    //driver.findElement(By.id("company")).sendKeys("Automation Exercise");
    //address 1
    driver.findElement(By.id("address1")).sendKeys("Chennai");
    //address 2  
    driver.findElement(By.id("address2")).sendKeys("Virugambakkam");
   //country
    WebElement countrys=driver.findElement(By.id("country"));
	Select countryvalue=new Select(countrys);
	countryvalue.selectByVisibleText("India"); 
	//state
	driver.findElement(By.id("state")).sendKeys("Tamilnadu");
	//city
	driver.findElement(By.id("city")).sendKeys("Chennai");
	//zipcode
	driver.findElement(By.id("zipcode")).sendKeys("600116");
	//mobile number
    driver.findElement(By.id("mobile_number")).sendKeys("9940465495");
    //submit
    WebElement createAccount=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
    createAccount.click();
    //continue button
    WebElement continuebutton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
    continuebutton.click();
    
    	}

}
