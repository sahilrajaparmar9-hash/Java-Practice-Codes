public class Animal
{
    void sound()
    {
        System.out.println("Animal makes Sound");
    }

    public static void main(String[] args)
    {
        Dog d = new Dog();

        d.sound();
        d.bark();
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}