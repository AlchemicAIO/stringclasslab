package stringclasslab;
import java.io.UnsupportedEncodingException;
import java.util.*;
//Write a Java program to enter two numbers and perform all arithmetic operations.
class stringclass 
{
	
		public static void main(String args[]) throws UnsupportedEncodingException 
		{
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the first number :-");
			double a = in.nextDouble();
			System.out.println("Enter the Second number :-");
			double b = in.nextDouble();
			double add = a+b;
			double sub = a-b;
			double mul = a*b;
			double div = a/b;
			double mod = a%b;
			System.out.println("The Sum of two number is :-"+add);
			System.out.println("The Subtraction of two number is :-"+sub);
			System.out.println("The Multiplication of two number is :-"+mul);
			System.out.println("The Division of two number is :-"+div);
			System.out.println("The Modules of two number is :-"+mod);
			
			//Trims the whitespace 
			
			String Str = new String("  I Love Macy's   ");

		      System.out.print("Return Value :" );
		      System.out.println(Str.trim() );
			  
		    //Find if a string contains a sequence of characters
		    System.out.println(Str.contains("Love"));
		   
		    //Convert string to boolean
		    boolean bool = Boolean.parseBoolean(Str);
		   System.out.println("Yes! It's True!");
		   //Find if the string starts with specified characters
		    System.out.println(Str.startsWith("I"));
		      
		      
		    //Prints i love macys in lowercase  
		      System.out.println(Str.toLowerCase());
			
		     //Checks if the input string is empty or not
		    String s="";  
			String s2="macys";  
			  
			System.out.println(s.isEmpty());  
			System.out.println(s2.isEmpty());  
			
			//.getByte method for encoding string
			byte array_bytes[] = Str.getBytes("UTF-16");
					
			for(byte content : array_bytes) {
				System.out.println(content);
			}
			
		   
		}	
			

			
			
			
			
			
			//Create a Java Method Compression to compress string
		   
			 
		public static String Compression(String s)
		{
			 
			 
			 
			 int count = 1;
		    StringBuilder sb = new StringBuilder();
		      
		  //Below for loop counts all characters of the string apart from the last one
		  //The last character won't get appended by the class StringBuilder here as it 
		  //does not enter the for loop once the length completes the count
		        for (int i = 1; i < s.length()-1 ; i++) 
		          {
		            if (s.charAt(i) == s.charAt(i - 1)) 
		            {
		              count++;
		            } 
		            else 
		            {
		              sb.append(s.charAt(i - 1));
		              sb.append(count);
		              count = 1;
		            }
		          }
		  //Count the last character of the string
		        if (s.length() > 1)
		          {
		          //Compare the last two characters of the string
		          if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2))
		            {
		              count++;
		            } 
		            else 
		            {
		              sb.append(s.charAt(s.length() - 2));
		              sb.append(count);
		              count = 1;
		            }
		            sb.append(s.charAt(s.length() - 1));
		            sb.append(count);
		          }
		          s = sb.toString();
		          System.out.println("The compressed string along with the counts of repeated characters is:" + "\n" +s);
		          return;
		        
		}
}	     
			
			
			
			
			
			
			
			
			
			 

