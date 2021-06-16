import java.util.Arrays;

public class HomeWorkArr {
    public static void main(String[] args) {
        int min=0;
        int max=0;
        int temp;
        int[] arr = new int[20];
        for (int i=0; i<arr.length; i++){
            arr[i]= (int) (Math.random()*10);
            if ( arr[min] > arr[i] )
                min = i;
            if ( arr[max] < arr[i] )
                max = i;
        }
        System.out.println(Arrays.toString(arr));
        temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
