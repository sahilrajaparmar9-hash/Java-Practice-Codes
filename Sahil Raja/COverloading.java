
import  java.util.*;
public class COverloading
{
	 
		
	COverloading(){
	    System.out.println("Defaul Constructer:");
	}
	
	COverloading(String name){
	     System.out.println("Name:"+name);
	    
	}
	COverloading(String name , int age)
	    {
	        
	          System.out.println("Name:"+name);
	          System.out.println("Age:"+age);
	    }
	    
	
	
	public static void main(String[] args) {
		
		COverloading c1 = new COverloading();
		COverloading c2 = new COverloading("Sahil Raja");
		COverloading c3 = new COverloading("Sahil Raja",19);
		
		
		
		  System.out.println("It called Constructor Overoading!!");
	}
}