  class Janvar
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
 class Dog extends Janvar 
    {
        void bark()
        {
            System.out.println("Dog Barks");
        }
    }
    class cat extends Janvar
    {
        void meow()
        {
            System.out.println("Cat Meows");
        }
    
    

public static void main(String[] args)
{
    Dog d = new Dog();
    cat c = new cat();

    d.sound();
    d.bark();
    c.sound();
    c.meow();
   
    // Dog d = new Dog();
    // d.sound();
    // d.bark();
  
      }
   }