// Java program to demonstrate the concept of abstraction

abstract class animal 
{
    abstract void sound();

    void eat()
     {
        System.out.println("Animal is eating");
    }
}

class dog extends animal 
{
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

public class main
 {
    public static void main (String[] args) 
    {
        dog d = new dog();
        d.sound();
        d.eat();
    }
}
