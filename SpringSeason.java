import java.util.Scanner;

public class SpringSeason {
	// Method to check if the given date is in spring season
    	public static boolean isSpringSeason(int month, int day) {
        	if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            		return true;
        	}
        	return false;
    	}

  
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for month and day
        	System.out.print("Enter month (1-12): ");
        	int month = sc.nextInt();

        	System.out.print("Enter day (1-31): ");
        	int day = sc.nextInt();

        	// Check if it's spring season
        	if (isSpringSeason(month, day)) {
            		System.out.println("It's a Spring Season");
        	} 
		else {
            		System.out.println("Not a Spring Season");
        	}
    	}
} 

