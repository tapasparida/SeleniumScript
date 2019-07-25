package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAPASPARIDA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.name("userName"));
		
		if (UN.isEnabled())
		{
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			//UN.clear();
		}
		
		if(UN.isDisplayed())
		{
			
			System.out.println(UN.getAttribute("value"));//fetches the attribute value
			System.out.println(UN.getAttribute("name"));//fetches the attribute name
			
			String name1 = UN.getAttribute("name");
			//driver.findElement(By.name(name1)).clear();
			//driver.quit();
			
			String label1 = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			System.out.println(label1);
		}
		
		
		
		
		
		
	WebElement UP = driver.findElement(By.name("password"));
	UP.sendKeys("sunil");
	driver.findElement(By.name("login")).click();
	Thread.sleep(30000);
	
	WebElement round = driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']"));
	if (round.isSelected())
	{
	driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();	
	}
	//Dropdown select
	//1st option
	
	
	
	WebElement  DD =driver.findElement(By.name("passCount"));
	Select sel = new Select(DD);
	List<WebElement> data = sel.getOptions();
	System.out.println("List size is " +data.size());
	
	for(int i=0;i<data.size();i++)
		{
		System.out.println(data.get(i).getText());
		}
	
	//First option
	sel.selectByVisibleText("2");
	Thread.sleep(2000);
	
	//Second option
	sel.selectByIndex(3);
	Thread.sleep(2000);
	
	//Third Option
	
	sel.selectByValue("1");
	
	//Dropdown 1
	WebElement  DD1 =driver.findElement(By.name("fromPort"));
	Select sel1 = new Select(DD1);
	List<WebElement> data1 = sel1.getOptions();
	System.out.println("List size is " +data1.size());
	for(int i=0;i<data1.size();i++)
	{
	System.out.println(data1.get(i).getText());
	}

//First option
//sel.selectByVisibleText("Frankfurt");
Thread.sleep(2000);

//Second option
sel.selectByIndex(0);
Thread.sleep(2000);

//Third Option

//sel.selectByValue("1");

//sel.selectByValue("1");
driver.findElement(By.name("findFlights")).click();
Thread.sleep(2000);
driver.findElement(By.name("reserveFlights")).click();
driver.findElement(By.name("passFirst0")).sendKeys("Tapas");
driver.findElement(By.name("passLast0")).sendKeys("Tapas");
//driver.findElement(By.name("passLast0")).sendKeys("Parida");
driver.findElement(By.name("creditnumber")).sendKeys("9988776655");
//driver.findElement(By.xpath("//*[@name='ticketLess' ]")).click();
List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));


//for (WebElement e:checkbox)
//{
//	e.click();
//	
//}

for (int i=1;i<=checkbox.size();i++)
{
	
checkbox.get(i).click();

};

driver.findElement(By.name("buyFlights")).click();




	
	
	}

}
