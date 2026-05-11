/*
    * A constructor is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
 */

/* 
public class simple_mess {

    // Constructor
   public simple_mess() 
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        simple_mess obj = new simple_mess();
    }
}

*/

// 2 . Question 

 public class simple_mess {
    int a;
    int b;

    // Constructor
   public simple_mess() 
    {
        System.out.println("Hello World");
        this.a = 10;
        this.b = 20;
    }

    public static void main(String[] args) {
        simple_mess obj1 = new simple_mess();
        simple_mess obj2 = new simple_mess();
        simple_mess obj3 = new simple_mess();
        System.out.println("sum of a and b is: =" + (obj1.a + obj1.b));
    }
    
}