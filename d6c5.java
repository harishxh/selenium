package com.selenium.g1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d6c5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				// open chrome
				WebDriverManager.chromedriver().setup();
		    	ChromeOptions co=new ChromeOptions();
		    	co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				
				//open an url
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)","");
				
				WebElement uname=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
				uname.sendKeys("Admin");
				
				WebElement pwd=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
				pwd.sendKeys("admin123");
				
				WebElement button1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				button1.click();
				
				String url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
				String url2=driver.getCurrentUrl();
				if (url1.equals(url2)) {
					System.out.println("successfully logged in");
				}
				else {
					System.out.println("not successfully logged in");
				}
				
				Thread.sleep(3000);
				
				WebElement profilebutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
				profilebutton.click();
				Thread.sleep(3000);
				WebElement logoutElement=driver.findElement(By.linkText("Logout"));
				logoutElement.click();
				

	}

}
