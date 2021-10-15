package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.vtiger.GenericUtils.javautilities;

public class tc_03 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		

		driver.findElement(By.name("accountname")).sendKeys("kkkkk");

		driver.findElement(By.name("website")).sendKeys("llll");
		driver.findElement(By.xpath("//img[@language='javascript']")).click();
		driver.getWindowHandles();
		

	
		
	}

}
