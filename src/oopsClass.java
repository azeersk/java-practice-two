abstract class student{
   abstract void details();

   public static void college(){
       String collName = "Lovely professional university";
       String branch = "Computer Science and Engineering";
       String state = "Punjab";
       String country = "India";
       System.out.println(collName);
       System.out.println(branch);
       System.out.println(state);
       System.out.println(country);
   }
}

class studentDetail extends student{
    public void details(){
        System.out.println("Name: "+ "Shaik azeer");
        System.out.println("Id: "+ "11805521");
        college();


    }
}
public class oopsClass {
    public static void main(String[] args){
        studentDetail obj = new studentDetail();
        obj.details();


    }
}
