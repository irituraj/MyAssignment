package assignment;
import java.util.Scanner;
public class SwappingWithoutTemp {

	public static void main(String[] args) {
		int num1,num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1= input.nextInt();
		num2= input.nextInt();
		System.out.println("Numbers before swapping are: " +num1+ " " +num2);
		num1= num1+num2;
		num2= num1-num2;
		num1= num1-num2;
		System.out.println("Numbers after swapping are: " +num1+ " " +num2);
		input.close();
	}
}
