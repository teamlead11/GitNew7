package sampleGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitnew3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH KUMAR\\Desktop\\"+ "gitnew_1\\GitNew7\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();	
	}

}
