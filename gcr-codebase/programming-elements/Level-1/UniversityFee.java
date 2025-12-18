//Creating a class to calculate University fee details

public class UniversityFee{
	public static void main(String[] args){

	//Creating variables to store fee and discountPercent
	int fee = 125000 , discountPercent = 10 ;

	//Calculating discount and fee to be paid
	int discount = fee - (fee * discountPercent / 100 );
	int feeToPay = fee - discount ;
	
	//Displaying total fees student needs to pay after applying discount
	System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR "  + feeToPay );
	}
}