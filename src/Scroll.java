

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeepa\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement homeScroll = driver.findElement(By.xpath("//span[contains(text(),'Greens Technologies Porur')]"));

		js.executeScript("arguments[0].scrollIntoView(true)", homeScroll);
		TakesScreenshot t =(TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d = new File("E:\\screen.png");
		FileUtils.copyFile(s, d);
		System.out.println(d);
		driver.quit();
	}

}
