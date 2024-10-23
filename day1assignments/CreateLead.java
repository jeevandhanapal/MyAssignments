package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("DemoCsr");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	loginButton.click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevan");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhanabal");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Team Lead");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();

	}
	

}