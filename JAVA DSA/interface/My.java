interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {

    public void myMethod() {
        System.out.println("Implementation of myMethod in MyClass");
    }
}

class AnotherClass implements MyInterface {

    public void myMethod() {
        System.out.println("Implementation of myMethod in AnotherClass");
    }
}

public class My {

    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.myMethod();

        AnotherClass obj2 = new AnotherClass();
        obj2.myMethod();
    }
}