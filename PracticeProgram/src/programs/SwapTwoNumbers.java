package programs;

public class SwapTwoNumbers{


	public void swapTwoNumbersWithoutUsingThridVariable(int intFirstNumber, int intSecondNumber) {
		/* a = 5  b = 9
		 * a = a+b = 5+9 = 14
		 * b = a-b = 14-9 = 5
		 * a = a-b = 14-5 = 9
		 */
		System.out.println("Swap two numbers Without using third variable");
		System.out.println("\nBefore Swaping FirstNumber = "+ intFirstNumber);
		System.out.println("Before Swaping SecondNumber = "+ intSecondNumber);
		intFirstNumber= intFirstNumber + intSecondNumber;
		intSecondNumber = intFirstNumber - intSecondNumber;
		intFirstNumber = intFirstNumber - intSecondNumber;

		System.out.println("\nAfter Swaping FirstNumber = "+ intFirstNumber);
		System.out.println("After Swaping SecondNumber = "+ intSecondNumber);
	}

	public void swapTwoNumberUsingThirdVariable(int intFirstNumber, int intSecondNumber) {
		int intTempVariable;

		System.out.println("Swap two numbers using third variable");
		System.out.println("\nBefore Swaping FirstNumber = "+ intFirstNumber);
		System.out.println("Before Swaping SecondNumber = "+ intSecondNumber);
		intTempVariable = intFirstNumber;
		intFirstNumber =intSecondNumber;
		intSecondNumber=intTempVariable;
		System.out.println("\nAfter Swaping FirstNumber = "+ intFirstNumber);
		System.out.println("After Swaping SecondNumber = "+ intSecondNumber);

	}


}
