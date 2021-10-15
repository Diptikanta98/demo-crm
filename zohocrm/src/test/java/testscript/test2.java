package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8888/");
		 driver.findElement(By.name("user_name")).sendKeys("admin");
		 driver.findElement(By.name("user_password")).sendKeys("admin");
		 driver.findElement(By.id("submitButton")).click();
		 driver.findElement(By.linkText("Calendar")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.name("search_text")).sendKeys("apple");
		 driver.findElement(By.linkText("Opportunities")).click();
		 
		 
		 

	}

}
