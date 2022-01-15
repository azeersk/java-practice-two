import java.util.Scanner;

public class lapindromesClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String sub = s.substring(s.length()/2);
        String subTwo = s.substring(s.length()/2,s.length());
        System.out.println(sub);
        System.out.println(subTwo);

        if (sub.equals(subTwo)){
            System.out.println("YES!!");
        }
        else{
            System.out.println("NO!!");
        }
    }
}
