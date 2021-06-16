public class FirstLesson {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        int oddNumbers[] = new int[numbers.length];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers[index] = numbers[i];
                index++;
            }

        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}
