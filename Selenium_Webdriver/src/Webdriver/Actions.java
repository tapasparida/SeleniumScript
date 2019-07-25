package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Actions {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TAPASPARIDA\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions act = new Actions(driver);
		Action mouseover =act.moveToElement(link).build();
		mouseover.perform();
		act.sendkeys(link,(Keys.ENTER)).build().perform();
		

	}

}
