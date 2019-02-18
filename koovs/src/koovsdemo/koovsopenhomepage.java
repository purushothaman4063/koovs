package koovsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class koovsopenhomepage {
	
	public WebDriver dr;
	public void koovs_homepage_open_function()
	

	{
		
		System.setProperty("webdriver.chrome.driver","G:/javaselenium/Drivers/chromedriver_win32/chromedriver.exe");
		dr= new ChromeDriver();
		
		dr.get("http://www.koovs.com");

		dr.manage().window().maximize();
	}

	public void validation_of_koovs_women_menu()
	{
		dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]")).click();
		
		
		//findoutthepagetitle
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		Actions object=new Actions(dr);
		object.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/women/tags/international-brands']//span[contains(text(),'INTERNATIONAL BRANDS')]//following::a[1]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		
		dr.findElement(By.xpath("//img[@src='//images.koovs.com/images/kv/koovs_logo_cpr.jpg']")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/shirts/']")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'T-Shirts & Polo Shirts')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/coats-and-jackets/?type=list&sort=relevance']")).click();
	
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/footwear/']//span[contains(text(),'Footwear')]")).click();

		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/accessories/?type=list&sort=latest']")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/sunglasses/?sort=latest']")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'Gym Gear')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/tags/wardrobe-basics/']")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'Crop Trousers')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'Checks & Stripes')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/brand/k-denim/']")).click();
	
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/brand/adidas/']")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/brands']//span[contains(text(),'A-Z of Brands')]")).click();

		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'KUNAL RAWAL X KOOVS')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();

		dr.findElement(By.xpath("//a[contains(text(),'MARVEL X KOOVS')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'Slogan Mania')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men/tags/last-chance-to-buy']//span[contains(text(),'LAST CHANCE TO BUY')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		object.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		
		dr.findElement(By.xpath("//a[contains(text(),'Adamo London')]")).click();
		
		System.out.println("applicationtitle"+"    "+ dr.getTitle());
		
		dr.findElement(By.xpath("//img[@src='//images.koovs.com/images/kv/koovs_logo_cpr.jpg']")).click();
		
		
		
		
		
		
		
		
	}
	
	public void selectprocduct() {
        dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]")).click();
		Actions object=new Actions(dr);
		object.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]"))).build().perform();
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/women/tags/international-brands']//span[contains(text(),'INTERNATIONAL BRANDS')]//following::a[1]")).click();
		dr.findElement(By.xpath("//img[@title='Ri-Dress Colour Block Shift Dress']")).click();
	}
}

