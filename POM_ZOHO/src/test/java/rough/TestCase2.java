package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {
	
	WebDriver driver;
	
	@Test (dataProvider="testData")
public void LoginTest2 (String username, String password,String browser ) {
		if (browser=="chrome") {
			driver= new ChromeDriver();

		}else if(browser=="firefox") {
			driver= new FirefoxDriver();

		}
		driver.get("https://zoho.com");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

	
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[5]")).click();
	driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
	

	
}
	
	
	@DataProvider
	public Object [][] testData(){
		Object [][] data= new Object[1][3];
	
		data[0][0]="pcs.selenium+yetanother@gmail.com";
		data[0][1]="SeleniumTraining";
		data[0][2]="chrome";
		
		return data;

		
		
	}
	
	
}
