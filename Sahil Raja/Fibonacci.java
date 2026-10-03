/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java .util.*;
public class Fibonacci
{
   //Fibonacci Series
	public static void main(String[] args) 
	{
	     int a = 0 , b = 1,c  ;
	     
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Terms: ");
	    int terms = sc.nextInt();
	    
	    
	    for (int i = 1; i<=terms;i++)
	    {
	    
	     System.out.print(a + " ");
	    
	    c= a+b;
	    a = b ;
	    b = c;


		
	    
	        
	    }
        sc.close();

	} 
}