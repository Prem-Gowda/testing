package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the number : ");
		int a =sc.nextInt();
		System.out.println("Enter the number : ");
		int b =sc.nextInt();
		
		int res = a/b;
		System.out.println("The division of 2 number is : " + res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please do not enter 0 in denominator");
		}
        catch(InputMismatchException e) {
        	System.out.println("Please enter only integer value");
        }
		catch(Exception e) {
			System.out.println("Please enter valid input");
		
		}
	}

}
