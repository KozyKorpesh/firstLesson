package school.lesson2;

public class UnitsDiagonal {

    public static void main(String[] args) {

        unitsDiagonal();
    }

    public static void unitsDiagonal(){

        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
