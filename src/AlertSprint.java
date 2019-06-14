

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeepa\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		WebElement signbtn = driver.findElement(By.xpath("//input[@class='zoom_button']"));
		signbtn.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.quit();

	}

}
