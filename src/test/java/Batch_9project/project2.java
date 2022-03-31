package Batch_9project;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project2 {

	WebDriver driver;

	@Before
	public void before() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://diseradental.ca/");

		driver.manage().window().maximize();
	}

	@Test
	public void test1() throws InterruptedException {

		// 2. On the top of menu button click on services
		// then each categories of service are clickable, Click on "General Dentistry"

		driver.findElement(By.id("service-button")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"service-menu\"]/div/div[1]/a/h4")).click();

		// 3. On this page verify all services in this category are visible

		WebElement element = driver.findElement(By.xpath("//*[@id=\"services\"]/div"));

		Assert.assertTrue(element.isDisplayed());

		Thread.sleep(1500);

		System.out.println(element.getText());

		// 4. After verified, on the top of menu button click on services then each
		// categories of service are clickable, Click on "Cosmetic Dentistry"

		driver.findElement(By.id("service-button")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"service-menu\"]/div/div[2]/a/h4")).click();

		WebElement cosmeticpage = driver.findElement(By.xpath("//*[@id=\"services\"]/div"));

		Thread.sleep(1500);

		Assert.assertTrue(cosmeticpage.isDisplayed());

		System.out.println("=============================================================");

		System.out.println(cosmeticpage.getText());

		driver.findElement(By.id("service-button")).click();

		driver.findElement(By.xpath("//*[@id=\"service-menu\"]/div/div[3]/a/h4")).click();

		WebElement childrenpage = driver.findElement(By.xpath("//*[@id=\"services\"]/div"));

		Assert.assertTrue(childrenpage.isDisplayed());

		System.out.println("===================================================================");

		Thread.sleep(1500);

		System.out.println(childrenpage.getText());

		driver.findElement(By.id("service-button")).click();

		driver.findElement(By.xpath("//*[@id=\"service-menu\"]/div/div[4]/a/h4")).click();

		WebElement addinationalserviecepage = driver.findElement(By.xpath("//*[@id=\"services\"]/div"));

		Assert.assertTrue(addinationalserviecepage.isDisplayed());

		System.out.println("===================================================================");

		Thread.sleep(1500);

		System.out.println(addinationalserviecepage.getText());

	}

}
