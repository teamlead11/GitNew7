package org.bash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swamy\\Desktop\\JAVA\\eclipse\\pravee\\Day4Tasks\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com");
WebElement e = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
String t = e.getText();
System.out.println(t);

}
}
