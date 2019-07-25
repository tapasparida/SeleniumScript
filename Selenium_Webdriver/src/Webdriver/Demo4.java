package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TAPASPARIDA\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://elearning.upskills.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.name("submitAuth")).click();
		//driver.close();
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Import")).click();
		//By.xpath(//*[@class=])
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\TAPASPARIDA\\Desktop\\Status on Badges Accquired_Tapas.xlsx");
		

	}

}
