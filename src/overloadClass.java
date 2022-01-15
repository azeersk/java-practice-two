import java.util.Scanner;

class overClass{
    public static void mainSma(){
        System.out.print( "befoure overlj ");
    }
    public static void mainSma(int a){
        System.out.println("check "+a);
    }

}


public class overloadClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        overClass oC = new overClass();
        oC.mainSma(a);
    }
}
