package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//Driver setup
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launching URL
		driver.get("https://www.ajio.com/");
		//Searching by name
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		Thread.sleep(2000);
		//Checkbox selection
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[1]/div/div/div[2]/ul/li[2]/div/div/label")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		//Displaying the total items
		String length=driver.findElement(By.className("length")).getText();
		System.out.println("No. of items are: "+length);
		//Total Brand list
		List<WebElement> bagBrand = driver.findElements(By.className("brand"));
		System.out.println("Total No of brands are :" + bagBrand.size());

		for (WebElement webElement : bagBrand) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		// Bags and their names
		List<WebElement> bagName = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagName.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagName) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		
		driver.close();
	}
}
