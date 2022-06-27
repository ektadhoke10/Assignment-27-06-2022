package Test;

import programs.SwapTwoNumbers;

public class SwapTwoNumbersTest extends SwapTwoNumbers {
public static void main(String[] args) {
	SwapTwoNumbers objSwapTwoNumbers = new SwapTwoNumbers();
	objSwapTwoNumbers.swapTwoNumbersWithoutUsingThridVariable(9, 5);
	System.out.println("===============================================");
	objSwapTwoNumbers.swapTwoNumberUsingThirdVariable(10, 6);
}
}
