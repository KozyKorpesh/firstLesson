package school.lesson2;

public class NumberSubstitution {

    public static void main(String[] args) {

        numberSubstitution();
    }

    public static void numberSubstitution() {
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }

    }
}
