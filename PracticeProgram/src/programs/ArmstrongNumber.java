package programs;

public class ArmstrongNumber {
public void checkNumberIsArmstrongOrNot(int intNumber) {
	int intSum=0;
	int intReminder;
	int intTempVariable = intNumber;
	while (intNumber>0)
	{
		intReminder= intNumber%10;
		intNumber=intNumber/10;
		intSum=intSum+(intReminder*intReminder*intReminder);
	}
	
	if (intTempVariable==intSum) {
		System.out.println(intTempVariable+ " is armstrong number");
	}
	else {
		System.out.println(intTempVariable+" is not armstrong number");
	}
}
}
