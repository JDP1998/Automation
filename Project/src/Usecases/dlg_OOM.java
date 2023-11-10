package Usecases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dlg_OOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jportzeh\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.de/");
		Thread.sleep(1000);
		if(driver.findElements(By.xpath("//*[@id=\"L2AGLb\"]/div")).size()>0) {
			driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
			Thread.sleep(1000);	
		}
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Order of Merit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).submit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"cl-consent\"]/div[1]/div[1]/div[2]/a[2]")).click();
		Thread.sleep(1000);
		List <WebElement> lst_Players = driver.findElements(By.xpath("//td[@class='pdc-order-of-merit--name order-of-merit-table']//child::a[contains(@href,'players')]"));
		Thread.sleep(1000);
		int i=0;
		for(i=0;i<=9;i++) {
			System.out.println(lst_Players.get(i).getText());
			System.out.println("\r\n");
		}
		Thread.sleep(1000);
		driver.quit();
		

	}

}
