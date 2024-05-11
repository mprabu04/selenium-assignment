package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	public static void main(String[] args) throws InterruptedException {
		
		// 01) Launch Firefox / Chrome / Safari / Edge  
		ChromeDriver driver = new ChromeDriver();
		
		// 02) Load the website
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 03) Type "Chennai" in the FROM text box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		
		// 04) Click the first option from the popup box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		
		// 05) Type "Bangalore" in the TO text box
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		
		// 06) Click the first option from the popup box
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		
		// 07) Click the'Tomorrow' button
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		
		// 08) Print the name of the first resulting bus (use .getText())
		String busName = driver.findElement(By.xpath("//div[contains(@id,'service-operator-agent')]/h5")).getText();
		System.out.println("Bus name is " +busName);
		
		// 09) Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		// 10) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		String busSeatCount = driver.findElement(By.xpath("//div[@class='text-grey']/small")).getText();
		System.out.println("Bus seat count is " +busSeatCount);
		
		// 11) Click Show Seats
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		
		// 12) Choose any one Available seat
		driver.findElement(By.xpath("//span[text()='DU6']")).click();
		
		// 13) Select the first resulting checkbox from the Boarding Point and Dropping Point
		driver.findElement(By.xpath("//p[text()='Sathyabamba University']")).click();
		driver.findElement(By.xpath("//div[@class='label']/p")).click();
		
		// 14) Print Seats Selected, Total Fare
		String seatNo = driver.findElement(By.xpath("//span[text()='Seat Selected :']/span")).getText();
		System.out.println("Seat no is " +seatNo);
		String totalFare = driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText();
		System.out.println("Total fare is " +totalFare);
		
		// 15) Get the Title of the page(use .getTitle())
		driver.getTitle();
		
		// 16) Close the browser
		driver.close();
		}

}
