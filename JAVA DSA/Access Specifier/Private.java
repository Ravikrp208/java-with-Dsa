// package JAVA DSA.Access Specifier;
class Test  {

    private int a = 20;

    private void show() {
        System.out.println("Private Method");
    }

    public void display() {
        System.out.println("Value of a: " + a);
        show();
    }
}

public class Private {

    public static void main(String[] args) {

        Test t = new Test();

        t.display();
    }
}