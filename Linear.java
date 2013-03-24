 import java.util.Scanner;
public class Linear {  
  double A,B,X;
	
	 Scanner input = new Scanner(System.in);
	 public Linear()
	 {
		 // you can leave it empty or you can make another way to solve the Home work 
		 // i will leave it for you 
	 }
	public Linear(double i , double t) // we forgot to make defualt constructor !!!
	{
		A=i;
		B=t;// get the values from the method 
	}
	 void inputdata()
	{
	 System.out.println("Enter value for A ");//message for user 
	 A=input.nextDouble();// nextDouble cause we used Double
	 System.out.println("Enter value for B ");
	 B=input.nextDouble(); 
	}
	 void solution()
	 {
		 // equation is Ax+b=0 so x=-b/a
		 X=-B/A;  
	 }
	 void printOut()
	 {
		 System.out.println("Value of X is "+X); // show results 
	 }

}
