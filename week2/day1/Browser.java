package week2.day1;

public class Browser {
	
	public String lauchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser launched successfully");
		return browserName;

	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser bwr = new Browser();
		bwr.lauchBrowser("Chrome");
		bwr.loadUrl();
	}
}
