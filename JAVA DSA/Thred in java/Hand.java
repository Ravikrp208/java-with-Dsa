import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Ravi\n");
            writer.write("Course: Java\n");
            writer.write("Age: 20");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
