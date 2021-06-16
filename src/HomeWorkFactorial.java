import java.util.Scanner;

public class HomeWorkFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result=1;
        System.out.println("Введите чсило от 1 до 15");
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Факториал вашего числа " + result);

    }
}
