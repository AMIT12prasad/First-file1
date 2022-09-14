package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateoneurltoanother {
	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().deleteAllCookies();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	
	String str=driver.getCurrentUrl();
	System.out.println("curent url of the page");
	driver.close();
	}
	
}
