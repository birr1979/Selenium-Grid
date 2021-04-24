package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainMethod {

	static String searchPrices="//div[@class='payment-section']//span[contains(text(),'$')]";
	static String modelsFilter="(//ul[@class='refinements'])[5]//li";
	
		
		public static void main(String[] args) {
	
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cars.com/for-sale/searchresults.action/?mkId=20017&prMx=175000&rd=50&searchSource=QUICK_FORM&stkTypId=28881&zc=20011");
			
				List<WebElement> Prices=driver.findElements(By.xpath(searchPrices));
		System.out.println("calculating the average prices of the search result in this catagory size of the list is "+Prices.size());
System.out.println(Prices.get(0).getText());
System.out.println(Prices.get(1).getText());
System.out.println(Prices.get(2).getText());
System.out.println(Prices.get(3).getText());

		double total=0;

		for (int i=0;i<Prices.size();i++) {

			total=total+Double.valueOf((Prices.get(i).getText().replace("$", "").replace(",", "")));
		}
		double average=total/Prices.size();
		System.out.println(average+" is the average price of the “" +"STOCKTYPE"+"” Car Search Results");

		//the number of models available to select
		List<WebElement> models=driver.findElements(By.xpath(modelsFilter));
		System.out.println("Make" +" has " +models.size()+ " models to choose from.");



		System.out.println("*******************Test Case Execution Ended ***************");
			
			
			
			
			
			
			
			
	
	}

}
