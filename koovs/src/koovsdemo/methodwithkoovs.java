package koovsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class methodwithkoovs {
	WebDriver dr;

	@Test
	void homepage()
	{
		System.setProperty("webdriver.chrome.driver","G:/javaselenium/Drivers/chromedriver_win32/chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("http://www.koovs.com");
		dr.manage().window().maximize();
		
	}
		
	@Test(dependsOnMethods="homepage")
	void SelectWomen()
	{
		Actions object=new Actions(dr);
		object.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]"))).build().perform();
		dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]"));
			
	}		

 @Test(dependsOnMethods="SelectWomen")
 void Selectdress()
 {
	dr.findElement(By.xpath("//a[@href='https://www.koovs.com/women/tags/international-brands']//span[contains(text(),'INTERNATIONAL BRANDS')]//following::a[1]")).click();
	
 }
}
	


