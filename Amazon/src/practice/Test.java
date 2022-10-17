package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple phone"+ Keys.ENTER);
		
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollby(0,200)");
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		
		driver.quit();
	}
}
