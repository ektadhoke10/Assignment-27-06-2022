package programs;

public class Factorial {
public void calculateFactorialOfNumber(int intNumber) {
	long longFactorial=1;
	
	for(int intNum=1;intNum<=intNumber;intNum++) {
		longFactorial=longFactorial*intNum;
	}
	System.out.println("Factorial of "+ intNumber + " is :"+longFactorial);
}
}
