import java.util.Scanner;

public class universeClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a>99){
            System.out.println("numbers at input are integers of one or two digits. only your input is not an one or two digit number!");
        }
        else if(a!=42){
            System.out.println(a);
        }
    }
}
