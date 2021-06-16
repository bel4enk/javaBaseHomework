public class HomeWorkReplace {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] agr = new int []{1,2,3,4,5};
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10)-3);
            //System.out.println(arr[i]);
            if (arr[i]<0) {
                agr[i] = 0;
            }
            System.out.println(agr[i]);
        }

    }
}
