package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoologin {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.yahoo.com/?.intl=in");
			driver.findElement(By.id("createacc")).click();
			Thread.sleep(9000);
			driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("AMIT");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@placeholder=\"Surname\"]")).sendKeys("KUMAR");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@spellcheck=\"false\"]")).sendKeys("amitp8763@gmail.com");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id=\"usernamereg-password\"]")).sendKeys("nothingone");
			driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1997");
			driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();
			driver.close();
			

	}

}
