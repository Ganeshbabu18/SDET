package MidLevel;
import java.util.Scanner;
public class Midlevel2
{
	 
		public static void main(String args[])
		{
			int i, j, k, n, a;
	 
			Scanner sc = new Scanner(System.in);
			System.out.println("The pattern is ");
			a = 4;
			for (i = 1; i <= 4; i++)
			{
				for (j = a; j > 1; j--)
				{
					System.out.print(" ");
				}
				for (k = i; k != 0; k--)
				{
					System.out.print(k);
	 
				}
				a--;
	 
				for (int l = 2; l <= i; l++)
				{
					System.out.print(l);
	 
				}
				System.out.println();
			}
	 
		}
	 
	}