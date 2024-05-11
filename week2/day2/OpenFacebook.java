package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
