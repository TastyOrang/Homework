package Main;
import java.util.Scanner;
public class homework2 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter first side");
		int side1 = a.nextInt();
		System.out.println("Enter second side");
		int side2 = a.nextInt();
		System.out.println("Enter third side");
		int side3 = a.nextInt();
		
		double perimetr = (side1+side2+side3)/2.0;
		
		double square = Math.sqrt(perimetr*(perimetr-side1)*(perimetr-side2)*(perimetr-side3));
		
		System.out.println("The area of a triangle is "+square);

	}

}
