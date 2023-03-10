package assignment_1;

public class Example_2 {

	public static void main(String[] args) {
    String s = "aaabb";
    char search1 = 'a';
    char search2 = 'b';
    int count = 0;
    int count1 = 0;
    
    
    for (int i = 0; i< s.length();i++) {
    	if (search1==s.charAt(i))
    		count++;
    	else if (search2==s.charAt(i))
    		count1++;
       }
    if ((count!=count1))
    {
    System.out.println("All Characters Have different number of Occurrences");
    }
    else {
    	System.out.println("All Characters have equal number if occurrences");
    }
    	
    }
}