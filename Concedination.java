
// Concedination of Strings
import java.util.*;

public class Concedination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter the Last Name: ");
        String LastName = scanner.next();
        String fullName = firstName + " " + LastName;
        System.out.println("The FullName is: " + fullName);
    }
}