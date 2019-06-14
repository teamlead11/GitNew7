package tests.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement from  = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To*']"));
		from.sendKeys("Chennai");
		to.sendKeys("Howrah");
	}

}
