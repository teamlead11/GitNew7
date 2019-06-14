package tests.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://twitter.com/login");
	WebElement userId = driver.findElement(By.className("js-username-field email-input js-initial-focus"));
	WebElement pwd = driver.findElement(By.className("js-password-field"));
	userId.sendKeys("arka93");
	pwd.sendKeys("whatever");
}
}
