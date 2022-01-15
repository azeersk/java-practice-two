import java.util.Scanner;

public class triangleClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a + b + c ==180){
            System.out.println("Given triangle is VALID!!");
        }
        else{
            System.out.println("Given triangle is NOT VALID!!");
        }

    }
}
