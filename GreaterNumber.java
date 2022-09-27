package assignment;
import java.util.Scanner;
public class GreaterNumber {

	public static void main(String[] args) {
	int num1,num2,num3;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three numbers :");
	num1 = input.nextInt();
	num2 = input.nextInt();
	num3 = input.nextInt();
	if(num1>num2 && num1>num3)
		System.out.println("The greatest number is: " +num1);
	else if(num1<num2 && num2>num3)
		System.out.println("The greatest number is: " +num2);
	else
		System.out.println("The greatest number is: " +num3);
	input.close();
	}
}
