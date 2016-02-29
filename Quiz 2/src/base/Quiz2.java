package base;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args){
		//A calculator for the total cost of tuition to complete a degree and to determine the monthly payment for student
		
		Scanner in = new Scanner(System.in); //Create a scanner object to get input from user
		
		//Ask user for input	
		System.out.println("Enter the initial tuition cost: ");
		double IntTuit = in.nextDouble();
		
		System.out.println("Enter the percentage increase for tuition: ");
		double TuitInc = (in.nextDouble()/100);
		
		System.out.println("Enter the repayment APR (in percent ): ");
		double R = (in.nextDouble()/100);
		
		System.out.println("Enter the term of repayment (in years): ");
		double T = in.nextDouble();
		
		//Calculate the total cost of tuition,
		double TCost = IntTuit;
		for(int i=1; i!=4; i++) {
			TCost=(TCost)+((TCost/i)*(1+TuitInc));	
		}
		
		System.out.print("Total cost of tuition over four years: $");
		System.out.printf("%.2f", TCost);
		System.out.print("\n");
		
		//Calculate the monthly payment
		
		double r = R+1;
		double t = T*12;
		
		double FCost = (((TCost*R*(Math.pow(r,t)))/((Math.pow(r,t))-1)));
		
		System.out.print("Cost of payment per month: $");
		System.out.printf("%.2f", FCost);
	
		in.close();
	}
}
