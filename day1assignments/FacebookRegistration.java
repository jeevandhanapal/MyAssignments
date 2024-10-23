package week2.day1assignments;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement createNewButton = driver.findElement(By.xpath("//a[@href='/r.php']"));
		createNewButton.click();
		driver.findElement(By.name("firstname")).sendKeys("Jeevan");
		driver.findElement(By.name("lastname")).sendKeys("Dhanabal");
		driver.findElement(By.name("reg_email__")).sendKeys("7358251189");
		driver.findElement(By.id("password_step_input")).sendKeys("Maanya@01");
		WebElement dateDOB = driver.findElement(By.id("day"));
		Select dateOB = new Select(dateDOB);
		dateOB.selectByValue("5");
		WebElement monthDOB = driver.findElement(By.id("month"));
		Select monthOB = new Select(monthDOB);
		monthOB.selectByValue("2");
		WebElement yearDOB = driver.findElement(By.id("year"));
		Select yearOB = new Select(yearDOB);
		yearOB.selectByValue("1989");
		driver.findElement(By.id("sex")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		WebElement signupButton = driver.findElement(By.name("websubmit"));
        signupButton.click();

	}

}
