package school.lesson2;

public class MultiplicationNumbers {

    public static void main(String[] args) {

        multiplicationNumbers();
    }

    public static void multiplicationNumbers(){

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
    }
}
