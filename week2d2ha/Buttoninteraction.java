package week2d2ha;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Buttoninteraction {
		
		public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.navigate().back();
		Set<String> windowHandles = driver.getWindowHandles();
		//convert set to list
		ArrayList<String> windowlist=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowlist.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).isDisplayed();
		driver.findElement(By.xpath("//span[text()='Submit']")).getText();
		Point location = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']")).getLocation();
		System.out.println(location);
		String color = driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getCssValue("background-colour");
		System.out.println(color);
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getSize();
		System.out.println(size);
		

	
	
	
	
	}

}
