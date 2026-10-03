
//Default Constructor

// public class Student {

//     Student(){
//         System.out.println("Constructor is Called");


//     }
// public static void main (String[]args){

//     Student s1 = new Student();

// }

// }


//Parameterized Constructor
public class Student {
    String name;
    void display(){
        System.out.println("Name:"+name);
    }
    
    public static void main (String[]args){
        Student s1 = new Student();
        s1.name = "Sahil Raja";
        
        s1.display();
    }
}