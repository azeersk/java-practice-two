import java.util.Arrays;
import java.util.Scanner;

public class smartPhoneClass {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[] arr = new long[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextLong();
//        }
//        Arrays.sort(arr);
//        for(int i = 0; i < n; i++){
//            arr[i] = arr[i] * (n-i);
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[n-1]);

        Scanner input = new Scanner(System.in);
        int ns = input.nextInt();
        long[] array = new long[ns];
        for(int i=0; i<ns; i++){
            array[i] = input.nextLong();
        }
        Arrays.sort(array);
        for(int j=0; j<ns; j++){
            array[j] = array[j]*(ns-j);
            System.out.println(array[j]);
        }
        Arrays.sort(array);
        System.out.println(array[ns-1]);
    }
}
