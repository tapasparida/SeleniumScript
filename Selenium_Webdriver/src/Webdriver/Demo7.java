package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAPASPARIDA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        
        driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
        Thread.sleep(2000);
        
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_TAB);
        
        //getWindowhandle
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tab.size());
        
        driver.switchTo().window(tab.get(1));
        String title1= driver.getTitle();
        System.out.println(title1);
        
        driver.switchTo().window(tab.get(0));
        String title2 = driver.getTitle();
        System.out.println(title2);
        
        if (title1.equals(title2))
        {
        	System.out.println("Titles are same");
        }
        
        else {
			System.out.println("Titles are different");
		}
        
        

	}

}
