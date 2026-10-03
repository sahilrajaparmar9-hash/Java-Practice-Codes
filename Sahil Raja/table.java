/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java .util.*;
public class table
{
   
	public static void main(String[] args) {
	     int Table  ;
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    for (int i = 1; i<=10;i++){
	        Table = num * i;
	        
	        System.out.println(num+"x"+i+"="+Table);
	    }

	} 
}