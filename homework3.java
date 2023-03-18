package Main;
import java.util.Scanner;
public class homework3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		double radius = a.nextDouble();
		
		double lenght = 2*radius*Math.PI;
		
		System.out.println("The lenght of circle is "+lenght);
	}

}
