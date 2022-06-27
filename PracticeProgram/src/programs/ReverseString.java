package programs;

public class ReverseString {
	public void printReverseString() {
		String strName = "VSTL";
		String strReverse ="";
		
		System.out.println("Original String is:	"+strName);
		 char charArray[]=strName.toCharArray();
		    for(int intCount=charArray.length-1;intCount>=0;intCount--){  
		    	strReverse+=charArray[intCount];  
		    }  
		    System.out.println("Reverse String is:	" +strReverse);
	}
}
