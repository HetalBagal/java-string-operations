// Comparition of Strings
import java.util.*;

public class Comparition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        String name1 = scanner.next();
        System.out.print("Enter the Last Name: ");
        String name2 = scanner.next();
        if (name1.equals(name2)) {
            System.out.print("They are the same Strings");
        } else {
            System.out.print("They are not name Strings");
        }
    }
}
