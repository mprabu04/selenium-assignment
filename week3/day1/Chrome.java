package week3.day1;

public class Chrome extends Browser{
	
		public void openIncognito() {
			System.out.println("Open incognito mode");
		}
		public void clearCache() {
			System.out.println("Clear cache");
		}
		public static void main(String[] args) {
			Chrome ch = new Chrome();
			ch.openURL();
			ch.closeBrowser();
			ch.navigateBack();
			ch.openIncognito();
			ch.clearCache();
		}
}
