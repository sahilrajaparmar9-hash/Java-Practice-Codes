import java.util.*;
public class AreaCircle
{
    public static void main(String []args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Radius Of Circle:");
        double r = sc.nextDouble();
        
    
        double area = 3.14;
        
        area = area*r*r;
        
        System.out.println("Area of Circle:"+area);
    
    }
    
    
}