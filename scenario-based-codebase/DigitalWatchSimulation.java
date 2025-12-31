//Creating a class to simulate a digital watch and stooping the watch when it turns 13:00

public class DigitalWatchSimulation{
	public static void main(String[] args){
	
		//Creating outer loop for hours
		for(int i=1; i<=24; i++){
			//Creating inner loop for minutes
			for(int j=1; j<=60; j++){
				//stop displaying time at 13:00
				if( i==12 && j>59 ){
					System.out.println("Power cut!!!");
					return;
				}
				System.out.println(i + " : " + j);
			}
			if(i==13){
				break;
			}
		
		}		
	}
}