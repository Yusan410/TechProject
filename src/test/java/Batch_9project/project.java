package Batch_9project;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project {
	
	
	WebDriver driver;
	@Before
	public void beforemethod() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://diseradental.ca/");

		driver.manage().window().maximize();
		
		
		
		
	}
	@Ignore
	@Test
	public void test() {
		
		//2. On homepage click on "Composite Fillings" under Dental Services
		//In Thornhill then you will go to the next page, verify with the header is correct
		//then go back to homepage
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[2]/a/h4")).click();
		
		 //driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 driver.navigate().back();
		 System.out.println(driver.getCurrentUrl());


		 //3. On homepage click on "Dental Bonding" under Dental Services In Thornhill then you will go to the next page,
		 //verify with the header is correct then go back to homepage
	
		
	}
	@Ignore
	@Test
	public void test2() {
		
		//3. On homepage click on "Dental Bonding" under Dental Services In Thornhill then you will go to the next page,
		 //verify with the header is correct then go back to homepage	
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[2]/a")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
	}
	@Ignore
	@Test
	public void test3() {
		
		//4. On homepage click on "Dental Bridges" under Dental Services In Thornhill then you will go to the next page,
		//verify with the header is correct then go back to homepage
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[3]/a")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
	}
	@Ignore
	@Test
	public void test4() {
		
		//5. On homepage click on "Dental Crowns" under Dental Services In Thornhill then you will go to the next page,
		//verify with the header is correct then go back to homepage
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[4]/a")).click();
		
		System.out.println("Dental Crowns page "+ driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("HomePage :"+driver.getCurrentUrl());
	}
	@Ignore
	@Test
	public void test5() {
		//6. On homepage click on "Dental Extractions" under Dental Services In Thornhill then you will go to the next page,
		//verify with the header is correct then go back to homepage
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[5]/a")).click();
		
		System.out.println("Dental Extractions page: "+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Homepage: "+driver.getCurrentUrl());
		
		
	}
	@Ignore
	@Test
	public void test6() {
		//7. On homepage click on "Dental Implants" under Dental Services In Thornhill then you will go to the next page, 
		//verify with the header is correct then go back to homepage
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[6]/a")).click();
		
		System.out.println("Dental imlement page: "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Homepage : "+driver.getCurrentUrl());
	}
	@Ignore
	@Test
	public void test7() {
		
		
		//8. On homepage click on "Dentures" under Dental Services In Thornhill then you will go to the next page, 
		//verify with the header is correct then go back to homepage
         driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[7]/a")).click();
         
         System.out.println("Dentures :" +driver.getCurrentUrl());
         
         driver.navigate().back();
         
         System.out.println("Homepage: " +driver.getCurrentUrl());
	}
	@Ignore
	@Test
	public void test8() {
		
		//9. On homepage click on "Root Canal" under Dental Services In Thornhill then you will go to the next page,
		//verify with the header is correct then go back to homepage
		
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[8]/a")).click();
		
		System.out.println("Root Clean page: " +driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("Homepage :" +driver.getCurrentUrl());
		
	}
	@Ignore
	@Test
	public void test9() {
		//10. On homepage click on "Same-Day Crowns" under Dental Services In Thornhill then you will go to the next page,
		//verify with the header is correct then go back to homepage
		
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[9]/a")).click();
		
		System.out.println("Same_day crowns page: "+driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("Homepage: "+ driver.getCurrentUrl());
		
		
	}
	@Ignore
	@Test
	public void test10() {
		
		//11. On homepage click on "Teeth Cleanings" under Dental Services In Thornhill then you will go to the next page, 
		//verify with the header is correct then go back to homepage
		
		driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[10]/a")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
	}
	
	

}
