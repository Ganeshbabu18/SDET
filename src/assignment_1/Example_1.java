package assignment_1;

public class Example_1 {

	public static void main(String[] args) {

		String s ="abacbc";
		char search1= 'a';
		char search2= 'b';
		char search3= 'c';
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i=0; i<s.length();i++) {
			if (search1==s.charAt(i))
				count++;
			else if(search2==s.charAt(i))
				count1++;
			else if(search3==s.charAt(i))
				count2++;
		}
		if ((count==count1)&&(count1==count2))
		{
		System.out.println("All Characters Have equal number of Occurrences"); //true
	}
		else {
			System.out.println("All Characters Have different number of Occurrences"); //false
		}
	}		
}
