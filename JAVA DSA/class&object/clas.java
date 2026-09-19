// package JAVA DSA.class&object;

public class clas {
    int Rollno;
    String Name;
    int Age;
    int Marks;
    long Phone;
    String Address;

    void input() {
        System.out.println("Rollno :- 1");
        System.out.println("Enter Name :-");
        System.out.println("Enter Age :-");
        System.out.println("Enter Marks :-");
        System.out.println("Enter Phone :-");
        System.out.println("Enter Address :-");
    }

    void display() {
        Rollno = 11;
        Name = "Ravi Kumar Pandit";
        Age = 20;
        Marks = 90;
        Phone = 1234567890L;
        Address = "Jharkhand, India";

        System.out.println("Rollno : " + Rollno);
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Marks : " + Marks);
        System.out.println("Phone : " + Phone);
        System.out.println("Address : " + Address);
    }

    public static void main(String[] args) {
        clas obj = new clas();

        obj.input();
        obj.display();
    }

    
}
