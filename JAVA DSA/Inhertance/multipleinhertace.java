public class multipleinhertace {

    interface A {
        void showA();
    }

    interface B {
        void showB();
    }

    class C implements A, B {

        public void showA() {
            System.out.println("A");
        }

        public void showB() {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {

        multipleinhertace obj = new multipleinhertace();
        C c = obj.new C();

        c.showA();
        c.showB();
    }
}