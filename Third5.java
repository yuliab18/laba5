import java.util.Scanner;

public class Third5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Введіть перше дробове число: ");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Введено некоректне число!");
            return;
        }

        System.out.print("Введіть друге дробове число: ");
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Введено некоректне число!");
            return;
        }

        System.out.print("Введіть третє дробове число: ");
        if (scanner.hasNextDouble()) {
            num3 = scanner.nextDouble();
        } else {
            System.out.println("Введено некоректне число!");
            return;
        }

        if (num1 > num2 && num1 > num3) {
            System.out.println("Перше число більше за друге та третє число.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Друге число більше за перше та третє число.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Третє число більше за перше та друге число.");
        } else {
            System.out.println("Декілька чисел мають однакові значення.");
        }
    }
}
