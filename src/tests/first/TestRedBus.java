package tests.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebElement source = driver.findElement(By.id("src"));
		WebElement dest = driver.findElement(By.id("dest"));
		source.sendKeys("Chennai");
		dest.sendKeys("Bangalore");
	}
}
