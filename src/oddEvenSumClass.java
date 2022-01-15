import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class oddEvenSumClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int even = 0;

        int odd = 0;
        for(int i = 1; i<=(a*2); i++){
            if(i%2==0){
                even = even+ i;

            }
            else{
                odd = odd + i;
            }
        }
        System.out.println("Even sum of numbers: "+ even);
        System.out.println("Odd sum of numbers: "+odd);
    }
}
