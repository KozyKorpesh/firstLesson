package school.lesson2;

public class TwoNumber {

    public static void main(String[] args) {

        twoNumber(5, 4);
    }

    public static boolean twoNumber(int a, int b){
        if(10 < a+b && a+b <= 20){
            return true;
        } else {
            return false;
        }

    }
}
