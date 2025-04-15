package week2d2ha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class editLead {

	public static void main(String[] args) {
	    EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("ElakkiyaPriya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("P S");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Elakkiya");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("automation testing");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("testing completed");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("shrielakkiya01@gmail.com");
		WebElement sourceDdown = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select sel =new Select(sourceDdown);
		sel.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("testing completed");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.getTitle();
				//driver.close();
		
		
		
		
		
		
		
	}		
		
	}

	