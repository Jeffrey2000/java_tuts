public class LeapYear {
    public static boolean isLeapYear(int year){
        //Intellij simplified my original code into just returning the boolean expression
        return (year % 4 == 0 && !(year % 100 == 0) || year % 100 == 0 && year % 400 == 0) && year >= 1 && year <= 9999;
    }
}
