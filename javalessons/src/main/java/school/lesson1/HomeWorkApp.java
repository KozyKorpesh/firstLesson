package school.lesson1;



public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){

        System.out.println("--task 2--");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("--task 3--");
    }

    public static void checkSumSign(){

        int a = 2;
        int b = 4;

        if (a+b >= 0){
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }
            System.out.println("--task 4--");
    }

    public static void printColor(){
        int value = 2;
        if(value <= 0){
            System.out.println("Красный");
        }
        if(0 < value && value <=100 ){
            System.out.println("Желтый");
        }
        if(value>100){
            System.out.println("Зеленый");
        }
            System.out.println("--task 5--");
    }

    public static void compareNumbers(){
        int a = 8;
        int b = 3;
        if(a>=b){
            System.out.println("a >= b");
        } else {
            System.out.println("a<b");
        }
    }
}
