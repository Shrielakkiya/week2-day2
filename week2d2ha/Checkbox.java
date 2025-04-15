package week2d2ha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box')]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text( )='Miami'])[2]]")).click();
		driver.findElement(By.xpath("(//label[text( )='London'])[2]]")).click();
		driver.findElement(By.xpath("(//label[text( )='Istanbul'])[2]]")).click();
		
		
			}

}
