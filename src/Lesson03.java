import java.util.Arrays;

public class Lesson03 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] numbers2 = {1,2,3};
        Arrays.sort(numbers);

        for (int i:numbers){
            System.out.println(i);
        }

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings ={"a","k","l","o"};
        String[] copyStrings=new String[strings.length];
        String[] copyString=Arrays.copyOf(strings, strings.length);
        System.out.println(Arrays.toString(copyString));

        if (numbers==numbers2){
            System.out.println("Arrays is equals");
        } else {
            System.out.println("Array"+Arrays.toString(numbers)+"is not equals to "+Arrays.toString(numbers2));
        }
        if (Arrays.equals(numbers,numbers2)){
            System.out.println("Arrays is equals");
        } else {
            System.out.println("Array"+Arrays.toString(numbers)+"is not equals to "+Arrays.toString(numbers2));
        }

    }
}
