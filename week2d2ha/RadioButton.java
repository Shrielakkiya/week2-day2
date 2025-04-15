package week2d2ha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		boolean unselected = driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
		System.out.println("unselected");
		boolean enabled = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		System.out.println("enabled");
		boolean selected = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println("selected");
	}

}
