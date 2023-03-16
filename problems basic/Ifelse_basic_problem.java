package Other_basic_java;
import java.util.Scanner;

public class Ifelse_basic_problem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n;
		 System.out.println("Enter a number : ");
		   n = in.nextInt();

		if (n % 2 != 1) {
		        System.out.println("weird");
		          }
	    else if ((n % 2 == 1) && (n >= 2 && n <= 5)) {
		        System.out.println("Not Weird");
	               }
		else if ((n % 2 == 1) && (n >= 6 && n <= 20)) {
		        System.out.println("weird");
		           }
		else if ((n % 2 == 1) && (n > 20)) {
			    System.out.println("Not weird");
		           }
		       }
		 }

