import java.util.Scanner;

public class squareClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int num = 0;
        String e = "";
        String o = "";
        String both = "";
        for(int i=1; i<=a; i++){
            int count = 1;
            for(int j=1; j<=5; j++){

                if(i%2 !=0){
                    System.out.print(j+ num + " ");
                }
                else{
                    System.out.print(j+ num +5-count+ " ");
                    count = count + 2;
                }
            }
            System.out.println();
            num =5*i;
        }
    }
}
