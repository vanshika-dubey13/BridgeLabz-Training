import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	double balance = 0;
        	char choice;

        	// displaying menu
        	do {
            	System.out.println("\n--- Currency Exchange ---");
            	System.out.println("Select which currency to convert into:");
            	System.out.println("1. USD");
            	System.out.println("2. EURO");
            	System.out.println("3. JPY");
            	System.out.println("4. GBP");
            	System.out.print("Enter choice (1-4): ");
            	String targetCurrency = sc.next();

            	// asking for INR amount
            	System.out.print("Enter amount in INR : Rs ");
            	double amountInINR = sc.nextDouble();

            	System.out.println("\nRecharge Successful!");
            	System.out.println("Operator Offers:");

            	switch (amountInINR) {
                	case 1:
				double inrToUSD = amountInINR / 89.83
                    		System.out.println("Amount in INR : "+ amountInINR); 
				System.out.println("Amount in USD : "+ inrToUSD);                 				break;
                	case 2:
				double inrToEuro = amountInINR / 105.674
				System.out.println("Amount in INR : "+ amountInINR); 
				System.out.println("Amount in EURO : "+ inrToEuro); 
                                break;
                	case 3:
				double inrToJPY = amountInINR / 0.57512
                    		System.out.println("Amount in INR : "+ amountInINR); 
				System.out.println("Amount in JPY : "+ inrToJPY);                     				break;
                	case 4:
				double inrToGBP = amountInINR / 121.198
                    		System.out.println("Amount in INR : "+ amountInINR); 
				System.out.println("Amount in GBP : "+ inrToGBP);                     				break;
                	default:
                    		System.out.println("Invalid Currency Selected!");
            	}

            	System.out.print("\nDo you want to continue currency conversion ? (y/n): ");
            	choice = sc.next().charAt(0);

        	} while (choice == 'y' || choice == 'Y');

        	System.out.println("\nThank you for using Currecy Exchange Kiosk!");
        	sc.close();
    	}
}
