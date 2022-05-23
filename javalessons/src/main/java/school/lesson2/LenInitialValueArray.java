package school.lesson2;

public class LenInitialValueArray {

    public static void main(String[] args) {

        lenInitialValueArray(4,9);
    }

    public static void lenInitialValueArray(int len, int initialValue){

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");

        }
    }
}
