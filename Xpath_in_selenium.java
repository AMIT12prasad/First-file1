package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_in_selenium {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.javatpoint.com/");
			driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/ul/li[13]/a")).click();//absolute xpath
			driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[4]/a")).click();// relative xpath
			
			
			

	}

}
