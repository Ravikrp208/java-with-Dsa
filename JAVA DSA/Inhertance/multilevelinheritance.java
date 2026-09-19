public class multilevelinheritance {
    
    
    class A {
        void showA() {
            System.out.println("Ravi Kumar Pandit");
        }
    }

    class B extends A {
        void showB() {
            System.out.println("advanced java");
        }
    }

    class C extends B {
        void showC() {
            System.out.println("Jharkhand, India");
        }
    }

    public static void main(String[] args) {

        multilevelinheritance obj = new multilevelinheritance();
        C c = obj.new C();

        c.showA();
        c.showB();
        c.showC();
    }
}
