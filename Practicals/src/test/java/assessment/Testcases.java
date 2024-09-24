package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Testcases {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	   
        //click testcase
        WebElement testcase=driver.findElement(By.cssSelector("a[href='/test_cases']"));
        testcase.click();
        //click 1. Register
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div/div[1]/h4/a/u")).click();
        
        
        

	}

}
