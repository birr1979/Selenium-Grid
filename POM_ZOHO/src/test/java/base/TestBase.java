package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	private static WebDriver driver;
	public static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();
	//getter for the driver
	public static WebDriver getDriver() {
		return dr.get();
	}
	//setter for the driver
	public static void setDriver(WebDriver driver ) {
		dr.set(driver);
	}
	
	//launch browser method
	
	public static void launchBrowser(String browser) {
		if (browser=="chrome") {
			driver= new ChromeDriver();

		}else if(browser=="firefox") {
			driver= new FirefoxDriver();

		}
		setDriver(driver);  //setting the driver to the thread safe 
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

	}
	

}
