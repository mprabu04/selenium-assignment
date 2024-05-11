package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		// 01) Launch Chrome  
		ChromeDriver driver = new ChromeDriver();
		
		// 02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 03) Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearch')]")).sendKeys("bags for boys");
		
		// 04) Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		
		// 05) Print the total number of results (like 50000)
	    // 1-48 of over 30,000 results for "bags for boys"
		String result = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]/span")).getText();
		System.out.println("Result is " +result);
		//String tag = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]/span/following-siblings::span")).getText();
		//System.out.println("Search result " +tag +result);
		
		// 06) Select the first brand in the left menu
		
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')])[4]/following-sibling::span")).click();
		
		// 07) Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		// 08) Print the first resulting bag info (name, discounted price)
		String bName = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']/span")).getText();
		System.out.println("Brand name is " +bName);
		String discoundPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price is " +discoundPrice);
		
		// 09) Get the page title and close the browser(driver.close())
		System.out.println("Current page title " + driver.getTitle());
		driver.close();
	}

}
