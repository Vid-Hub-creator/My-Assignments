package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		// Edge Initialization
				EdgeDriver driver = new EdgeDriver();
				// Maximize the window
				driver.manage().window().maximize();
				// Wait Statement
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				// Load URL
				driver.get("https://en-gb.facebook.com/");
				//Click on the Create new account button.
				driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
				//Enter the First name.
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sri");
				//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selenium");
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sen");
				driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("123456");
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password");
				WebElement element= driver.findElement(By.xpath("//select[@id='day']"));
				Select opt = new Select(element);
				opt.selectByVisibleText("8");
				WebElement element1= driver.findElement(By.xpath("//select[@id='month']"));
				Select opt1 = new Select(element1);
				opt1.selectByVisibleText("Mar");
				WebElement element2= driver.findElement(By.xpath("//select[@id='year']"));
				Select opt2 = new Select(element2);
				opt2.selectByVisibleText("2020");
				driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
				System.out.println("Successful");
				driver.close();
				
}}
