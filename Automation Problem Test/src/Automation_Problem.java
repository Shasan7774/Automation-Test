import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahr\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get the specified URL
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//find the sign in button
		driver.findElement(By.xpath(" //a[contains(text(),'Sign in')]")).click();
		//register user1
		driver.findElement(By.id("email_create")).sendKeys("Testuseer123@gmail.com");
		driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(1) form.box div.form_content.clearfix div.submit:nth-child(4) button.btn.btn-default.button.button-medium.exclusive:nth-child(2) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Test_User");
		driver.findElement(By.id("customer_lastname")).sendKeys("NewUser");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("testpwd123");
		driver.findElement(By.id("days")).getAttribute("1");
		driver.findElement(By.id("months")).getAttribute("1");
		driver.findElement(By.id("years")).getAttribute("1990");
		driver.findElement(By.xpath("//label[contains(text(),'Sign up for our newsletter!')]")).click();
		driver.findElement(By.id("firstname")).sendKeys("Test_FirstName");
		driver.findElement(By.id("lastname")).sendKeys("LastName");
		driver.findElement(By.cssSelector("#company")).sendKeys("Test Company");
		driver.findElement(By.id("address1")).sendKeys("Test Address");
		driver.findElement(By.id("city")).sendKeys("Test CIty");
		driver.findElement(By.id("id_state")).getAttribute("Alabama");
		driver.findElement(By.id("postcode")).sendKeys("45001");
		driver.findElement(By.id("phone_mobile")).sendKeys("00141584850");
		driver.findElement(By.id("alias")).sendKeys("Test Address");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/")).click();
		
		//find the sign in button
		driver.findElement(By.xpath(" //a[contains(text(),'Sign in')]")).click();
		//register user2
		driver.findElement(By.id("email_create")).sendKeys("Testuseer333@gmail.com");
		driver.findElement(By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(1) form.box div.form_content.clearfix div.submit:nth-child(4) button.btn.btn-default.button.button-medium.exclusive:nth-child(2) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Test_User33");
		driver.findElement(By.id("customer_lastname")).sendKeys("NewUser33");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("testpwd33");
		driver.findElement(By.id("days")).getAttribute("5");
		driver.findElement(By.id("months")).getAttribute("5");
		driver.findElement(By.id("years")).getAttribute("1995");
		driver.findElement(By.xpath("//label[contains(text(),'Sign up for our newsletter!')]")).click();
		driver.findElement(By.id("firstname")).sendKeys("Test_Second");
		driver.findElement(By.id("lastname")).sendKeys("TestLastName");
	    driver.findElement(By.cssSelector("#company")).sendKeys("Test Company 123");
		driver.findElement(By.id("address1")).sendKeys("Test Address 123");
		driver.findElement(By.id("city")).sendKeys("Test CIty213");
		driver.findElement(By.id("id_state")).getAttribute("Alabama213");
		driver.findElement(By.id("postcode")).sendKeys("55001");
		driver.findElement(By.id("phone_mobile")).sendKeys("1232131");
		driver.findElement(By.id("alias")).sendKeys("Test Address213");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/")).click();		
	

	}

}
