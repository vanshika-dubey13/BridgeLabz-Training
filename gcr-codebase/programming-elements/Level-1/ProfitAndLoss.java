//Creating a program to calculate the profit and loss in number and percentage based on the cost price 

public class ProfitAndLoss{
	public static void main(String[] args){
	//Creating variables to store cost price and selling price
	int costPrice = 129 , sellingPrice = 191;
	
	//Calculating profit
	int profit = sellingPrice - costPrice;
	//Calculating profit percentage 
	double profitPercentage = (double) profit / costPrice * 100;
	
	//Displaying profit and profit percentage
	System.out.println(
    "The Cost Price is INR " + costPrice 
    + " and Selling Price is INR " + sellingPrice 
    + "\nThe Profit is : " + profit 
    + " and the profit percentage is : " + profitPercentage + " %"
);
	sc.close();
	}
}