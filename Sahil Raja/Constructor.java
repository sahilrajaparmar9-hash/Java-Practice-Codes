// Paramaterized Constructor
// import java.util.*;

// public class Constructor {
//     String name;
// Constructor (String n)
// {
//     name = n;
// }
//     void display(){
//         System.out.println("Name:"+ name);
        
//     }
//     public static void main (String[]args){

//       Constructor s1 = new Constructor("Sahil");
//     //   s1.name = "Raja";
//        s1.display();
//     }
// }




//Default Constructor
// import java .util.*;
// public class Constructor
// {
//     Constructor()
// 	    {
// 	        System.out.println("Constructer Called");
// 	    }
	    
    
	    
// public static void main(String[] args) 
//  { 
//      Constructor c = new Constructor();
     
 
//  }
// }
 
	    
//Copy Constructor	   


import java .util.*;
public class Constructor
{
    String name ;
    int roll;

    //Parameterized Constructor
    Constructor(String n, int r)
    {
        name = n ;
        roll = r;
        
    }
    

    //Copy Constructor
    Constructor( Constructor s)
    {
        name = s.name;
        roll = s.roll;
    }
    
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll);
    }

public static void main(String[] args) 
 { 

    
     
     Constructor c1 = new Constructor("Sahil",151);
     Constructor c2 = new Constructor(c1);

     System.out.println("Details of Student 1:");
     c1.display();
     System.out.println("Details of Student 2:");
     c2.display();
     
 
 }
}
 
	    
	   
     

  

