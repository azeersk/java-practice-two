import javax.sound.midi.SysexMessage;
import java.util.Scanner;

class ludo{
    public void ludo(){
        System.out.println("Cunstructer one: ");
    }
    public void ludo(String a){
        System.out.println( a+ " this game challenges!!");
    }
    public static void game(){
        System.out.println("4 mostly members can play!!");
        System.out.println("this game plays using Die!");
    }
}

class chess extends ludo{
    public static void game(){
        System.out.println("Chess game: ");
    }
}

public class newMainClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ludo ne = new ludo();
        ne.ludo();
        String a = input.nextLine();
        ne.ludo(a);

        chess gObj = new chess();
        System.out.println();
        System.out.println("Constructor ");
        gObj.ludo();
        System.out.println();
        gObj.game();
    }

}
