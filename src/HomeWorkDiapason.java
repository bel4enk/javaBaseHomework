import java.util.Scanner;

public class HomeWorkDiapason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое чиcло");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе чиcло");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                System.out.print(i + " ");
            }

        } else if(number1 > number2){
            for (int i = number1; i <= number2; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
