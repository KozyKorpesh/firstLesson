package school.lesson2;

public class NumberOfPositiveOrNegative {
    public static void main(String[] args) {

        numberOfPositiveOrNegative(-4);
    }

    public static void numberOfPositiveOrNegative(int c){
        if(c >= 0){
            System.out.println("положительный");
        } else {
            System.out.println("отрицательный");
        }
    }
}
