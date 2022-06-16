import java.util.*;

public class Program8{

   public static void main(String args[]){
         
		 int a;
		 
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number to reverse( Max three)");
        a = sc.nextInt();

         while(a>0){
                  int temp;
				  temp = a%10;
				  a = a/10;
				  System.out.print(temp);
				 
		 }			 
   } 
 
}
