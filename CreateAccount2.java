package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {

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
		driver.findElement(By.id("accountName")).sendKeys("JJ");
		// Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Testera");
		// Comp SW
		WebElement element = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select opt = new Select(element);
		opt.selectByVisibleText("Computer Software");
		// Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement element2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select opt1 = new Select(element2);
		opt1.selectByVisibleText("S-Corporation");

		WebElement element3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select opt2 = new Select(element3);
		opt2.selectByValue("LEAD_EMPLOYEE");
		// Ecommercesite internal campaign
		WebElement element4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select opt3 = new Select(element4);
		opt3.selectByIndex(5);
		// select Texas using select by value
		WebElement element5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select opt4 = new Select(element5);
		opt4.selectByValue("TX");
		// click create account
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Verify that the account name is displayed correctly.
		String text = driver.findElement(By.xpath("//span[contains(text(),'JJ')]")).getText();
		System.out.println(text);
		if (text.contains("JJ")) {
			System.out.println("Lead Account is created");
		} else {
			System.out.println("Lead Account is not created");
		}
		// Close the browser window
		driver.close();

	}

}
