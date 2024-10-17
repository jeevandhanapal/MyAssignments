package week1.day2;

public class CheckNumberIsPositive {
	
    int version = 10;
    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is Positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }


	public static void main(String[] args) {
		
		  CheckNumberIsPositive jeevan = new CheckNumberIsPositive();

	         System.out.println("Version: " + jeevan.version);

	        jeevan.checkNumber(10);    
	        jeevan.checkNumber(-2);   
	        jeevan.checkNumber(0);    

	}

}
