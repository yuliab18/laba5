import java.util.Scanner;

public class Second5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть п'ять довільних слів: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();

        String firstLetters = word1.substring(0, 1) + word2.substring(0, 1) + word3.substring(0, 1) + word4.substring(0, 1) + word5.substring(0, 1);

        System.out.println("Перші літери введених слів: " + firstLetters);
    }
}
