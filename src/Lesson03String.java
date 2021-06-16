import java.util.Arrays;

public class Lesson03String {
    public static void main(String[] args) {
        double[] numbers = createArray(10);;

        fillArray(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
    public static void fillArray (double[] numbers){
        for (int i=0; i<numbers.length; i++){
            numbers[i]=Math.random();

        }
    }

    public static double[] createArray (int length){
        return new double[length];
    }
}
