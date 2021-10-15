package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.javautilities;

public class TC_01CreateOrganisation {
	@Test
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();

		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("ttttttt4554" );
				
		driver.findElement(By.name("assigned_user_id")).click();

		driver.findElement(By.name("website")).sendKeys("rrrrrr");

		WebElement industry = driver.findElement(By.name("industry"));
		Select s = new Select(industry);
		s.selectByValue("Engineering");
		WebElement type = driver.findElement(By.name("accounttype"));
		Select s2 = new Select(type);
		s2.selectByIndex(7);
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.id("fax")).sendKeys("101010");
		driver.findElement(By.name("otherphone")).sendKeys("787878");
		WebElement rating = driver.findElement(By.name("rating"));
		Select s3 = new Select(rating);
		s3.selectByValue("Active");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();

		WebElement d = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a = new Actions(driver);
		a.moveToElement(d).perform();

		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();

	}

}
