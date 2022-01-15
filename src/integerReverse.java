import java.util.Scanner;

public class integerReverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        String reverse = "";
        for(int i=0; i<numbers; i++) {
            int number = input.nextInt();
            while (number != 0) {
                int a = number % 10;
                reverse = reverse + a;
                number = number / 10;
            }
            System.out.println(reverse);
            reverse = "";
        }

    }
}
