package manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermanager 
{
	private static WebDriver driver;
	
	Webdrivermanager ()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 74new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//to get Driver
		public static  WebDriver getDriver() {
			if (driver==null) {
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 74new\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			}
			return driver;
		}
		
		
		public void CloseDriver()
		{
			if (!(driver==null)) 
			{
				driver.quit();
				driver = null;
				
			}
		}
		
		

	

	

}
