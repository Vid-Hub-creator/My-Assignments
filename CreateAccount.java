package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// Edge Initialization
		EdgeDriver driver = new EdgeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
		// UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		// CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Account Tab
		driver.findElement(By.linkText("Accounts")).click();
		// Create Account
		driver.findElement(By.linkText("Create Account")).click();
		// Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("Sup");
		// Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Testera");
		// No of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("4");
		// SiteName
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		// Create Account
		// driver.findElement(By.xpath("//input[@value=Create Account")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String text = driver.findElement(By.xpath("//span[contains(text(),'Sup')]")).getText();
		System.out.println(text);
		if (text.contains("Sup")) {
			System.out.println("Lead Account is created");
		} else {
			System.out.println("Lead Account is not created");
		}
		// Close the browser window
		driver.close();

	}

}
