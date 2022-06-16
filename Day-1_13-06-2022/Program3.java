import java.util.*;

public class Program3{
	
	public static void main(String args[]){
		
		
		double inch,meter;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the one value:  ");
		inch = sc.nextDouble();
		meter = inch * 0.0254;

          System.out.println("The given inches into meter is  " + meter);		
	}
	
	
	
}