interface Bank {

    // Abstract method
    void withdraw(int amount);
}

class SBI implements Bank {

    public void withdraw(int amount) {
        System.out.println("Withdrawn amount: " + amount);
    }
}

public class bankAtm {
    public static void main(String[] args) {

        Bank b = new SBI();

        b.withdraw(5000);
    }
}