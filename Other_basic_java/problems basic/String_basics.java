package Other_basic_java;
// QUESTION:
//This exercise is to test your understanding of Java Strings. A sample String declaration:
//
//String myString = "Hello World!"
//The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//
//Given two strings of lowercase English letters,  and , perform the following operations:
//
//Sum the lengths of  and .
//Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.
//Input Format
//
//The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//Output Format
//
//There are three lines of output:
//For the first line, sum the lengths of  and .
//For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
//For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

//Solution:

import java.io.*;
import java.util.*;

public class String_basics {

    public static void main(String[] args) {
  String a = "hello";
  String b = "java";
  System.out.println(a.length() + b.length());
  int lex = a.compareTo(b);
  
   if (lex < 0 ){
      System.out.println("No");
   }
   else{
      System.out.println("Yes");
     }
   a = a.substring(0, 1).toUpperCase() + a.substring(1);
   b = b.substring(0, 1).toUpperCase() + b.substring(1);
   System.out.println(a + " " + b);
}
}

