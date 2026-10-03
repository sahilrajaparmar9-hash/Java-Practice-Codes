class animals
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
  public  class Dog extends animals 
    {
        void bark()
        {
            System.out.println("Dog Barks");
        }
    }
public static void main(String[] args)
{
    
    
    Dog d = new Dog();
    d.sound();
    d.bark();
    
//    public  class Dog extends animals 
//     {
//         void bark()
//         {
//             System.out.println("Dog Barks");
//         }
//     }
}