package cts.miniproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript {

public void loginToApplication( ) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dinesh\\eclipse-workspac\\Sample_Selinium\\src\\main\\resources\\binaries\\chromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.findElement(By.className("txtUsername")).sendKeys("Admin");
driver.findElement(By.className("txtPassword")).sendKeys("admin123");
driver.findElement(By.className("btnlogin")).click();


}

}