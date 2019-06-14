package tests.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement userId = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		WebElement pwd = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		userId.sendKeys("arka93");
		pwd.sendKeys("whatever");
	}
}
