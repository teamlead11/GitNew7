package tests.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LakshmiVilasBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		WebElement id = driver.findElement(By.xpath("//input[@name='username']"));
		id.sendKeys("arka93");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));		
		pwd.sendKeys("arka1234");
	}
}
