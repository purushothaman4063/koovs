package koovsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class alertclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/javaselenium/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		
		dr.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("9940646168");
		Actions object=new Actions(dr);
		object.moveToElement(dr.findElement(By.xpath("//span[contains(text(),'Next')]"))).build().perform();
		dr.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("SidduKutty123");
		Actions object1=new Actions(dr);
		object1.moveToElement(dr.findElement(By.xpath("//span[contains(text(),'Next')]"))).build().perform();
		dr.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
	 
		

}
