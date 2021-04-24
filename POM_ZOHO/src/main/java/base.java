import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	static WebDriver driver;
	public static void launchBrowser(String browserName) {
	
		if(browserName=="chrome") {
			driver=new ChromeDriver();
			
		} else if(browserName=="firefox") {
			driver=new ChromeDriver();
			
		}
		
		driver.get("https://www.google.com");
	}

	

}
