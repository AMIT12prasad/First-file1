package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_In_Selenium {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			//findelement: first web element matching to the given property
			//findelements: List of elements matching to the given property
			
			driver.get("https://www.snapdeal.com/");
			driver.manage().window().maximize();
			driver.findElement(By.className("catText")).click();
			Thread.sleep(3000);
}

}
