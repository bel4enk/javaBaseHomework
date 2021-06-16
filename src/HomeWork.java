public class HomeWork {
    public static void main(String[] args) {
        int sum;
        int summa;
        int first = 1;
        int second = 10;

        if (first == second)
            System.out.println(sum = first * second);
        else System.out.println(sum = first + second);

//
        double time = 6.45;
        if (time >= 7.00 && time <= 20.00) {
            System.out.println("Its OK");

        } else System.out.println("Its a problem");

//
        summa = first * second;
        if (first == 10 || second == 10 || summa == 10) {
            System.out.println("true");
        } else System.out.println("false");


//
        int a = 4;
        int b = -5;
        boolean negative = false;
        while (a < 0 || b < 0) {
            negative = true;
            break;
        }
        if (negative = true) {
            while (a < 0 && b < 0) {
                negative = true;
            }
        }
        System.out.println(negative);

//

        if (a % 3 == 0 || a % 5 == 0) {
            System.out.println("True");
        } else System.out.println("False");

//

        int temp1 = -92;
        int temp2 = -56;
        if (temp1 > 0 && temp2 < 0) {
            System.out.println("true");
        } else if (temp1 < 0 && temp2 > 0) {
            System.out.println("true");
        } else System.out.println("false");


//


    }
}
