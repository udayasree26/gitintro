package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Basic {

	
		// TODO Auto-generated method stub
		
		WebDriver driver;
		Actions act;
		WebDriverWait wait;
		
		@BeforeClass
		void login() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/tool-tips");
			
			
			
		}
		@AfterClass
		void logout() {
			driver.quit();
		}
		
		@Test(priority=1)
		void tooltip() throws InterruptedException {
			
			wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement button=driver.findElement(By.id("toolTipButton"));
			wait.until(ExpectedConditions.visibilityOf(button));
			act=new Actions(driver);
			act.moveToElement(button).perform();
			Thread.sleep(2000);
		}
		
		@Test(priority=2)
		void tooltip2() throws InterruptedException {
			
			wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement button=driver.findElement(By.id("toolTipTextField"));
			wait.until(ExpectedConditions.visibilityOf(button));
			act=new Actions(driver);
			act.moveToElement(button).perform();
			Thread.sleep(2000);
		}
		
		

	}


