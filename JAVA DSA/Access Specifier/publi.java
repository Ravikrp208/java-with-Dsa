// package JAVA DSA.Access Specifier;

class Test  {

    public int a = 10;

    public void display() {
        System.out.println("Value of a: " + a);
    }
}

public class publi {

    public static void main(String[] args) {

        Test t = new Test();

        t.display();
    }
}