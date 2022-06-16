import java.util.Scanner;

public class Program2{

   public static void main(String args[]){
	   
	   int x,y;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of X ");
	   x = sc.nextInt();
	   System.out.println("Enter the value of y ");
	   y = sc.nextInt();
	   
	   System.out.println("Before swapping  "+x +" "+ y);
	   
	
	   x = x + y;
	   y = x - y;
	   x = x - y;
	   
	System.out.println("After swapping "+x +" "+ y);
	}
	}
