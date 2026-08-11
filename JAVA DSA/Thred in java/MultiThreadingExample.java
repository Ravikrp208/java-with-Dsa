public class MultiThreadingExample {

    private final String name;

    public MultiThreadingExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void call(MultiThreadingExample caller) {

        System.out.println(this.getName() + " has asked to call me " + caller.getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        caller.callMe(this);
    }

    public synchronized void callMe(MultiThreadingExample caller) {

        System.out.println(this.getName() + " has called me " + caller.getName());
    }

    public static void main(String[] args) {

        MultiThreadingExample caller1 = new MultiThreadingExample("caller-1");
        MultiThreadingExample caller2 = new MultiThreadingExample ("caller-2");

        new Thread(new Runnable() {

            @Override
            public void run() {
                caller1.call(caller2);
            }

        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                caller2.call(caller1);
            }

        }).start();
    }
}