package Firstcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		//co.setBrowserVersion("beta");
		co.setBinary("C:\\Users\\2025720\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(co);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Satyajeet");
        System.out.println(driver.getTitle());

	}

}
