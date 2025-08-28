package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUNC\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		Sibling -> sibling, child -> parent traverse
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
//		parent to child and sibling to sibling
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		
//		child to parent   //header/div/button[1]/parent::div
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).click(); 
		System.out.println("Login2: "+driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
