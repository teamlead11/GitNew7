package tests.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Adactin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		WebElement userName  = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		userName.sendKeys("arka93");
		pwd.sendKeys("arka1234");
	}

}
