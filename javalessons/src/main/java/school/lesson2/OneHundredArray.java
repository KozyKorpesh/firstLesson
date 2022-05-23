package school.lesson2;

public class OneHundredArray {

    public static void main(String[] args) {

        oneHundredArray();
    }

    public static void oneHundredArray(){

            int[] array = new int[100];
            int numberPlus = 0;
            for (int i = 0; i < array.length; i++) {
                numberPlus = numberPlus + 1;
                System.out.print(numberPlus + " ");
            }


    }
}
