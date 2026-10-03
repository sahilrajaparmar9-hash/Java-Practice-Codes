class animals
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
  class Dog extends animals 
    {
        void bark()
        {
            System.out.println("Dog Barks");
        }
    }

        class Labrador extends Dog
        {
            void color()
            {
                System.out.println("Color Black");
            }
        
    
public static void main(String[] args)
{
    
    
    // Dog d = new Dog();
    // d.sound();
    // d.bark();
    Labrador l = new Labrador();
    l.sound();
     l.bark();
    l.color();
    
//    public  class Dog extends animals 
//     {
//         void bark()
//         {
//             System.out.println("Dog Barks");
//         }
//   }
  
   }

}

 