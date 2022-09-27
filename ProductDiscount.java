package assignment;
import java.util.Scanner;
public class ProductDiscount {

	public static void main(String[] args) {
		String productName;
		float productPrice,finalPrice;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the Product");
		productName = input.nextLine();
		System.out.println("Enter the price of the Product");
		productPrice = input.nextFloat();
		if(productPrice>2000) {
			float discount1;
			discount1 = productPrice*0.1f;
			System.out.println("Your Product is : "+productName);
			System.out.println("Your Discount is : "+discount1);
			finalPrice = productPrice - discount1;
			System.out.println("Final Price of Product is : "+finalPrice);
	}
		else {
			float discount2;
			discount2 = productPrice*0.07f;
			System.out.println("Your Product is : "+productName);
			System.out.println("Your Discount is : "+discount2);
			finalPrice = productPrice - discount2 ;
			System.out.println("Final Price of the Product is : "+finalPrice);
			input.close();
		}

}
}