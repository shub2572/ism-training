 import java.util.Scanner;
 
class Employee{

   public static void main(String args[]){
   
      int salary,tax;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the employee name : ");
	    String empname = sc.next();
	  	  
	  Scanner sc1 = new Scanner(System.in);
       System.out.println("Enter the salary:  ");	  
	  salary = sc1.nextInt();
	  Scanner sc2 = new Scanner(System.in);
       System.out.println("Enter the tax:  ");	  
	  tax = sc2.nextInt();
	  
	  System.out.println("Name of employee :  " +empname);
	  System.out.println("Salary of employee:  " +salary);
	  System.out.println("Tax paid by employee: " +tax);
	  
	  
    
   }

}
