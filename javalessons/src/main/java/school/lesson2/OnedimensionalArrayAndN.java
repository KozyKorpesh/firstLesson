package school.lesson2;



public class OnedimensionalArrayAndN {
    public static void main(String[] args) {

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int n = 4;
        onedimensionalArrayAndN(array, n);


    }

    public static int[] onedimensionalArrayAndN(int[] array, int n){

        if (n > 0) {
            for (int s = 1; s <= n; s++) {
                int numberN = array[array.length - 1];
                for (int i = array.length - 2; i >= 0; i--) {
                    array[i + 1] = array[i];
                }
                array[0] = numberN;
            }
        } else if (n < 0) {
            for (int s = n; s <= -1; s++) {
                int numberN = array[0];
                for (int i = 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                }
                array[array.length - 1] = numberN;
            }
        }
        return array;
    }



}
