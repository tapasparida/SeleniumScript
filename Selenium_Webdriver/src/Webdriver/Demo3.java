package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAPASPARIDA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//Write code to click performance tab
		Thread.sleep(3000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement e:links)
		{
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//how many links ,link size,get text of the links
//		
//		List<WebElement> lnk = (List<WebElement>) driver.findElement(By.tagName("a"));
//		
//	    int lnksize=lnk.size();
//	    
//	    for (WebElement link:lnk)
//	    {
//	    	System.out.println(link.getAttribute("href"));
//	    	System.out.println(link.getText());
//	    }
	    
		
		
		

	}

}
