package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;

public class TestCase3withBaseclass2 extends TestBase{
	
	WebDriver driver;
	
	@Test (dataProvider="testData")
public void LoginTest (String username, String password,String browser ) {
		launchbrowser(browser);
		
		getDriver().get("https://zoho.com");

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

	
		getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/div/a[5]")).click();
		getDriver().findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(username);
		getDriver().findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		getDriver().findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		getDriver().findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
	

	
}
	
	
	@DataProvider (parallel =true)
	public Object [][] testData(){
		Object [][] data= new Object[1][3];
		data[0][0]="pcs.selenium+yetanother@gmail.com";
		data[0][1]="SeleniumTraining";
		data[0][2]="chrome";

		
		return data;

		
		
	}
	
	
}
