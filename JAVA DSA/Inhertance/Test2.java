class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class BabyDog extends Dog {

    void weep() {
        System.out.println("Baby dog weeps");
    }
}

public class Test2 {

    public static void main(String[] args) {

        BabyDog b = new BabyDog();

        b.eat();
        b.bark();
        b.weep();
    }
}