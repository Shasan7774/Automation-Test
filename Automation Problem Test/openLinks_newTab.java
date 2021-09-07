
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class openLinks_newTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahr\\OneDrive\\Documents\\chromedriver.exe");
			//property defined by selenium
		WebDriver driver = new ChromeDriver();
		//return type of driver should be WebDriver

		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //Limiting WebDriver Scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
			//Click on each link in the column and check if the pages are opening
		
		
		for(int i=0; i<=columnDriver.findElements(By.tagName("a")).size();i++)
		{
			//Open links in New Tab
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
		
			

	}

}
