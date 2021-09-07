import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahr\\OneDrive\\Documents\\chromedriver.exe");
			//property defined by selenium
		WebDriver driver = new ChromeDriver();
		//return type of driver should be WebDriver
	
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
												                   //Customized CSS
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());//*** Not Working *****//

		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();

		//driver.findElement(By.id("draggable")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(" //a[contains(text(),'Accept')]")).click();


	}

}
