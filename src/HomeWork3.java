public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, -4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0 && arr[i+1]<0){
                arr[i]=arr[i]*3;
            }
            System.out.println(arr[i]);
        }
    }
}
