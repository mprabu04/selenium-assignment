package week3.day1;

public class OverloadingEx {
	public void reportStep(String msg, String status) {
		System.out.println(msg + " " + status);
		

	}
	
	public void reportStep(String msg, String status, boolean takeSnap) {
		System.out.println(msg + " " + status + " Snap enable: " + takeSnap);
		

	}
	public static void main(String[] args) {
		OverloadingEx oex = new OverloadingEx();
		oex.reportStep("TC1", "PASS");
		oex.reportStep("TC1", "PASS", true);
	}
}
