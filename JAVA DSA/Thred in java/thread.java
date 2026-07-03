class MyThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);

            try {
                Thread.sleep(1000);   // Wait for 1 second
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();   // Starts the child thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
