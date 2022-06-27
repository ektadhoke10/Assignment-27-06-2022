package programs;

public class CommonElementsInArray {

	int intFirstArray[]= {2,5,12,12,15,22,32};
	int intSecondArray[]= {5,12,15,20,22,35};
	int intThirdArray[]= {10,15,22,32,65};
	public void printCommonElementsInArray() {
		int intSizeofFirstArray = intFirstArray.length;
		int intSizeofSecondArray = intSecondArray.length;
		int intSizeofThirdArray = intThirdArray.length;

		int intIndexofFirstArray = 0;
		int intIndexofSecondArray = 0; 
		int intIndexofThirdArray = 0; 
		System.out.println("Common Elements in 3 Array:");
		while (intIndexofFirstArray < intSizeofFirstArray && intIndexofSecondArray < intSizeofSecondArray && intIndexofThirdArray < intSizeofThirdArray) {
		
			if (intFirstArray[intIndexofFirstArray] == intSecondArray[intIndexofSecondArray] && intSecondArray[intIndexofSecondArray] == intThirdArray[intIndexofThirdArray]) {
				System.out.println(intFirstArray[intIndexofFirstArray]);

				intIndexofFirstArray++; intIndexofSecondArray++; intIndexofThirdArray++;
			}
			else if (intFirstArray[intIndexofFirstArray] < intSecondArray[intIndexofSecondArray]) {
				intIndexofFirstArray++;
			}
			else if (intSecondArray[intIndexofSecondArray] < intThirdArray[intIndexofThirdArray]) {
				intIndexofSecondArray++; 
			}
			else {
				intIndexofThirdArray++;
			}
		}
	}
}	
