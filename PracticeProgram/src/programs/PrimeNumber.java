package programs;

public class PrimeNumber {
	public void printPrimeNumber() {

		int intTotal=0;
		//Empty String
		String  strPrimeNumbers = "";
		for (int intNum = 1; intNum <= 100; intNum++)         
		{ 		  	  
			int intCount=0; 	  
			for(int intNumber = intNum; intNumber>=1; intNumber--)
			{
				if(intNum%intNumber==0)
				{
					intCount = intCount + 1;
				}
			}
			if (intCount == 2)
			{
				//Appended the Prime number to the String
				strPrimeNumbers = strPrimeNumbers + intNum + " ";
				intTotal = intTotal+1;
			}	
		}
		System.out.println("Prime Numbers Between 1 to 100 are: ");
		System.out.println(strPrimeNumbers);
		System.out.println("Total: "+ intTotal);
	}
}
