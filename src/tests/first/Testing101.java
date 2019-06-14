package tests.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing101 {
	public static void main(String[] args) {
		// setting the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arka\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String url = driver.getCurrentUrl();
		System.out.println("Current url in use is " + url);
		String title = driver.getTitle();
		System.out.println("Title is " + title);
	}
}
