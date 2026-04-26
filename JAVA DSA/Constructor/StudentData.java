// 2. Parameterized Constructor Program
class StudentData {
    String name;
    int age;

    StudentData(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        StudentData s1 = new StudentData("Ravi", 20);
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}