package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Webtable\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> row = driver.findElements(By.tagName("tr"));
	for (WebElement x : row) {
		List<WebElement> cell = driver.findElements(By.tagName("td"));
	for (WebElement y : cell) {
		String t = y.getText();
		System.out.println(t);
	if (t.equals("Mecca")) {
		System.out.println(t);
	}
	}
	}
	driver.quit();
	
}
}
