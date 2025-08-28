package selenium;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Scanner sc = new Scanner(System.in);
		
//		Set From city	
		System.out.println("Enter from City code");
		String fromCity =sc.next();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(fromCity);
		
//		Set to City
		System.out.println("Enter to City code");
		String toCity = sc.next();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='"+toCity+"']")).click();
		
		System.out.println("How many adults you want to add" );
		int numberOfAdults = sc.nextInt();
//		Select number of adults 
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i=1;
		if(numberOfAdults!=1)
		{
//			while(i<numberOfAdults)
			while(numberOfAdults>1)
			{
				driver.findElement(By.id("hrefIncAdt")).click(); //number of adults as per input
//				i++;
				numberOfAdults--;
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
		}
				
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		sc.close();
	}

}
