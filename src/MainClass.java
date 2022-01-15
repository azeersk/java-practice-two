//overriding

class vehicle{
    public static void speed(int min, int max){
        int carSpeed = min;

        if(carSpeed==min){
            System.out.println("Car speed: " + min);
            System.out.println("your car speed is normal!!");
        }
        else{
            System.out.println("Car speed" + max);
            System.out.println("your car speed is maximum please Reduce!!");
        }
    }
}

class car extends vehicle{
    public static void speed(int max){
        int carS = max;
        if (carS >= max){
            System.out.println("your car is in too speed!");
        }
        else{
            System.out.println("your car is speed is normal!");
        }
    }
}


public class MainClass {
    public static void main(String[] args){
        car newObj = new car();
        int min = 20;
        int max = 70;
        newObj.speed(min);
        newObj.speed(max);
    }
}
