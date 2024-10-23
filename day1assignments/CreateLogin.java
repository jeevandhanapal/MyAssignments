package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoCsr");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Jeevan");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("5");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.className("smallSubmit")).click();
String title= driver.getTitle();
System.out.println(title);
driver.close();


	}

}
