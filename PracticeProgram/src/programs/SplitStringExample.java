package programs;

public class SplitStringExample {
	public void spliString() {
		String strCompanyName = "Verve Square Technology pvt.ltd.";
		System.out.println("Original Stirng: "+strCompanyName);

		System.out.println("After Split :" );      
		for (String strResult: strCompanyName.split(" ")) {
			System.out.println(strResult);
		}
	}
}
