package Chapter8PPElishaGarcia;


/**Student Name: Elisha Garcia

*Date Completed: 005/08/2020

*Project No. and Page No. in the book: Project 6, chapter 8, pg. 355 - 399

*Extra Credit: No

*Project Description: Using arrays to ask the user for his/her monthly earnings. 
*					  Then displaying the earning along with the difference between the two.

**/


//importing DecimalFormat so i can formal my doubles. 
import java.util.*;
import java.text.DecimalFormat;


public class Chapter8PPElishaGarcia {
	
	public static void main (String[] args) {
		
		//Making my scanner and DecimalFormat objects
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//declaring all of my arrays
		double[] twentyEighteen = new double[12];
		double[] twentySeventeen = new double[12];
		double[] difference = new double[12];
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
		
		//asking the user for monthly earnings in 2018 and storing values in array
		System.out.println("Please enter your monthly earnings in 2018:");
		for (int i=0; i<twentyEighteen.length; i++) {
			System.out.print(months[i] + ": ");
			twentyEighteen[i] = scan.nextDouble();
		}
		
		//asking the user for monthly earnings in 2017 and storing values in array
		System.out.println("\nPlease enter your monthly earnings in 2017:");
		for (int i=0; i<twentySeventeen.length; i++) {
			System.out.print(months[i] + ": ");
			twentySeventeen[i] = scan.nextDouble();
		}
		
		//assigning the difference between 2018 monthly earning and 2017 monthly earnings and storing the values in array
		for (int i=0; i<difference.length; i++) {
			difference[i] = twentyEighteen[i] - twentySeventeen[i];
		}
		

		//printing out chart header		
		System.out.println();
		System.out.println("\t2018\t2017\tDifference");
		
		//printing out chart body
		for (int i=0; i<months.length; i++) {
			System.out.println(months[i] + ".\t" + twentyEighteen[i] + "\t" + twentySeventeen[i] + "\t" + df.format(difference[i]));
		}
		
			
		
	}

}
