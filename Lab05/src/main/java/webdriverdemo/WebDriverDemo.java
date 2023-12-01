package webdriverdemo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class WebDriverDemo {
	@Test
    public void testPositiives() {
		//Set up web driver (chrome, firefox,...)
		//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      assertEquals("5",result);
	      
	      //Close the Browser.{
	      driver.close();
	      
    }
	@Test
    public void testNegatives() {
		//Set up web driver (chrome, firefox,...)
		//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      
	      driver.findElement(By.id("cpar1")).sendKeys("-200");
	      driver.findElement(By.id("cpar2")).sendKeys("-55");
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      assertEquals("-155",result);
	      
	      //Close the Browser.{
	      driver.close();
	      
    }
	@Test
    public void testPositiives_Negative() {
		//Set up web driver (chrome, firefox,...)
		//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      
	      driver.findElement(By.id("cpar1")).sendKeys("70");
	      driver.findElement(By.id("cpar2")).sendKeys("-80");
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      assertEquals("-56",result);
	      
	      //Close the Browser.{
	      driver.close();
	      
    }
	@Test
    public void testNegative_Positiives() {
		//Set up web driver (chrome, firefox,...)
		//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      
	      driver.findElement(By.id("cpar1")).sendKeys("-20");
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      assertEquals("50",result);
	      
	      //Close the Browser.{
	      driver.close();
	      
    }
}