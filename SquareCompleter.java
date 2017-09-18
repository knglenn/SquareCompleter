//===============================================================
// # Completing the Square by Kevin Glenn
//
//
// Description:
// # Program that asks users for the coefficents of a quadratic
//  equation then completes and prints the square.
//==============================================================

//include the scanner class
import java.util.Scanner;

public class SquareCompleter
{
	public static void main(String args[])
	{
		//declare our variables
		double a, b, c;

		//let's print the program name and author
		System.out.println("SquareCompleter by Kevin Glenn");

		//create the scanner to read input
		Scanner scan = new Scanner(System.in);

		//prompt the user to enter in their variables a,b,&c) and set the variables to have the values that they input
		System.out.print("Enter a: ");
		a = scan.nextDouble();

		System.out.print("Enter b: ");
		b = scan.nextDouble();

		System.out.print("Enter c: ");
		c = scan.nextDouble();

		//create string called pmb(plusminusb) that we will use in the if else statement to properly handle negative signs
		String pmb;
		//create variable ib with an absolute value so as to avoid non-real numbers
		double ib = Math.abs(b);

		//create if else statement that will properly handle negative values of b using our string pmb we created
		if(b < 0){
			pmb = "- ";
		}
		else{
			pmb = "+ ";
		}

		//string pmc and variable ic
		String pmc;
		double ic = Math.abs(c);

		//if else statement for c
		if(c < 0){
			pmc = "- ";
		}
		else{
			pmc = "+ ";
		}

		//print the original quadratic equation with the values of a, b, and c plugged in
		System.out.println(a + "*x^2 " + pmb + ib + "*x " + pmc + ic + " = 0");

		//create the new variables p, q, and r and calculate what they'll be
		double p = a;
		double q = (b/(2*a));
		double r =  c - ((b*b)/(4*a));

		//string pmr and variable ir
		String pmr;
		double ir = Math.abs(r);

		//if else statement for r
		if(r < 0){
			pmr = "- ";
		}
		else{
			pmr = "+ ";
		}

		//string pmr and variable ir
		String pmq;
		double iq = Math.abs(q);
		
		//if else statement for q
		if (q < 0){
			pmq = "- ";
		}
		else{
			pmq = "+ ";
		}

		//print the completed square version of the equation
		System.out.print(p + "*(x " + pmq + iq + ")^2 " + pmr + ir + " = 0");

	}
}
