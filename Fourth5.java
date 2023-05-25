import java.util.Scanner;

public class Fourth5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = scanner.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = scanner.nextLine();

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Ці імена ідентичні.");
        } else {
            System.out.println("Ці імена не ідентичні.");
        }
    }
}
