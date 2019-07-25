package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//****Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAPASPARIDA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//**maximize
		driver.manage().window().maximize();
		
		//PrintTitle
		String ExpectedTitle = driver.getTitle();
		//System.out.println(ExpectedTitle);
		String expectedTitle = "OrangeHRM";
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		String ActualTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
		System.out.println("Acttual matched expected");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		driver.close();//closes active browser
		
		//driver.quit();//closes all browser,no return type,no comment
		
		}
		
		else
		{
			System.out.println("Expected is not actual result");
		}
		
		
		
		
		
//		//****Firefox
//		
//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		//WebDriver driver = new FirefoxDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		//driver.get("http://google.co.in");

	}

}
