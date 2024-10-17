package week1.day2;

public class Browser {
	
	public void launchBrower(String browserName) {
		// TODO Auto-generated method stub
		
		System.out.println("Browser Launched Successfully");
		

	}
public void loadURL() {
	// TODO Auto-generated method stub
System.out.println("Application url loaded successfully");


	
}
	public static void main(String[] args) {
		Browser a = new Browser();
		a.launchBrower("Chrome");
		a.loadURL();
	}
	
}
