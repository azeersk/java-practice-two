import java.util.Scanner;

public class factorialClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i=0; i<a; i++){
//            int count=5,tot=0;
//            while(count<=n) {tot+=n/count;count*=5;}
//            System.out.p
            int num = input.nextInt();
            int count = 5;
            int t = 0;
            while (count<=num){
                t = t + num/count; //2
                count = count*5; //25
            }
            System.out.println(count);
        }
    }
}
