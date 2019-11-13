package org.winhand;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Webtable\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lvbankonline.in/index.html?module=login");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='forgotPassword'][2]")).click();
	String pwind = driver.getWindowHandle();
	System.out.println(pwind);
	Set<String> allwind = driver.getWindowHandles();
	System.out.println(allwind);
	for (String x : allwind) {
		if(!(x.equals(pwind))) {
			driver.switchTo().window(x);
		}
	}
	Thread.sleep(10000);
	
	driver.findElement(By.id("ui-id-6")).click();
	
}
}
