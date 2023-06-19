package Seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
	
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\eclipse-workspace\\Selenium\\src\\Seleniumjava\\chromedriver.exe");


System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\eclipse-workspace\\Selenium\\src\\Seleniumjava\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.nykaa.com/sp/appliances/appliances");
		driver.get("https://www.nykaa.com/ikonic-professional-curling-tong-ct28/p/85228");
	
		WebElement pincode1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[5]/div[2]/div/div[2]/span/input"));
		
		Thread.sleep(100);
		pincode1.sendKeys("695581");
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[5]/div[2]/div/div[2]/button")).click();
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[5]/div[1]/div/button ")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		
		
	WebElement searchbox =driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[1]/div/form/input"));
		searchbox.sendKeys("Hand sanitizer");
		searchbox.submit();
		

		Thread.sleep(100);
		driver.get("https://www.nykaa.com/bloomsberry-icecream-holder-with-sanitizer/p/2802115?productId=2802115&pps=3");
		
		
		
		
		Thread.sleep(100);
		driver.navigate().back();
		driver.navigate().back();
		
		driver.get("https://www.nykaa.com/sp/natural-native/natural?root=nav_1");
		
		driver.findElement(By.xpath("//*[@id=\"620cd6b7b4421256c56205e6\"]/div/div[1]/div[3]")).click();
		
		
		driver.get("https://www.nykaa.com/mamaearth-curd-smoothening-shampoo/p/10135035?productId=10135035&pps=9");
		
		Thread.sleep(100);
		driver.get("https://www.nykaa.com/mamaearth-ultra-light-india-sunscreen-spf50-pa-with-turmeric-carrot-seed-80ml/p/472487?productId=472487&pps=1");
		
		
	WebElement pincode=	driver.findElement(By.name("pin code"));
		
		
		pincode.sendKeys("695581");
		
		driver.findElement(By.xpath("//button[contains(text(),'Check')]")).click();
		
		
		driver.navigate().to("https://www.nykaa.com/sp/natural-native/natural?root=nav_1");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[5]/div[2]/div/div[2]/button")).click();
		
	Thread.sleep(100);
WebElement addtocart=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[5]/div[1]/div/button/span"));
	

			addtocart.click();
			
	driver.navigate().back();
		


		driver.navigate().to("https://www.nykaa.com/mamaearth-hydragel-indian-sunscreen-spf-50-with-aloe-vera-raspberry-for-sun-protection-50g/p/807651?productId=807651&pps=3");
		
		
		
			WebElement pincode=	driver.findElement(By.name("pin code"));
			
			
		pincode.sendKeys("695581");
			
		driver.findElement(By.xpath("//button[contains(text(),'Check')]")).click();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
	driver.navigate().to("https://www.nykaa.com/sp/natural-native/natural?root=nav_1");
			
		
		driver.navigate().to("https://www.nykaa.com/stores-n-events-desktop");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");
		driver.get("https://goo.gl/maps/gjUU5aGN9Us");
		driver.navigate().back();
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0, 1000)");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div[2]/form/div[1]/div/input"));
		email.sendKeys("sreeprabhas78@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div[2]/form/div[2]/button")).click();
	
		driver.navigate().back();
		
		driver.get("https://www.nykaa.com/giftcard.html?root=hdr_giftcards");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/ul/li/div/div[3]/div[10]/div/button")).click();
		
		
		
		driver.findElement(By.name("name")).sendKeys("Sreelakshmi");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/form/div[3]/div/div/div/input")).sendKeys("9497042057");
		driver.findElement(By.name("message")).sendKeys("Wishing you the Happiest Birthday ever!.May all your wishes come true!");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")).sendKeys("500");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/form/div[8]/div/div/div/input")).sendKeys("sreeprabha");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/form/div[9]/div/div/div/input")).sendKeys("9497042051");
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/form/div[11]/button")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[1]/div[1]/div/input")).sendKeys("1234");
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div[3]/div[1]/div/div[1]/div[1]/div/input")).sendKeys("11/2023");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div[3]/div[2]/div/div[1]/div[1]/div/input")).sendKeys("1234");
		
		
		driver.navigate().back();
		driver.get("https://www.nykaa.com/gateway-api/omsApis/helpCenter?domain=NYKAA");
		Thread.sleep(100);
		WebElement help=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/div/div/div[1]/div/input"));
		help.sendKeys("Track order");
		help.sendKeys(Keys.ENTER);
		
		driver.findElement(By.className("css-1tn74xg e8pythv0")).submit();
		
		
		
		
		
		
	}
}

		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	