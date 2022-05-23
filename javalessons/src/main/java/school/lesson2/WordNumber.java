package school.lesson2;



public class WordNumber {
    public static void main(String[] args) {

    wordNumber(4,"hello");
    }

    public static String wordNumber(int i, String word) {

        String sumword = "";
        for(int u = 0; u<i; u++){
            sumword = sumword+word;
        }
        System.out.println(sumword);
        return sumword;
    }
}
