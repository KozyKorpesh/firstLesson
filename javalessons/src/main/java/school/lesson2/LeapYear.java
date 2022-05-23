package school.lesson2;



public class LeapYear {

    public static void main(String[] args) {

        leapYear(2019);
    }

    public static boolean leapYear( int year){
        return year % 400 ==0 || (year % 4 == 0 && year % 100 != 0);
    }
}
