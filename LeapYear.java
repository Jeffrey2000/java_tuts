public class LeapYear {
    public static boolean isLeapYear(int year){
        //Intellij simplified my original code into just returning the boolean expression
        return (year % 4 == 0 && !(year % 100 == 0) || year % 100 == 0 && year % 400 == 0) && year >= 1 && year <= 9999;
    }
    // 30 has sep, april, june and nov
    // jan, march, may,july, aug,oct,dec 31
    //feb 28 or 29 on leap year
    public int getDaysInMonth(int month, int year){
        (if 1 < month < 12 || 1 < year < 9999){
            return -1;
        }else if(month == 2){
            if(isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }else if(month % 2 == 0 && < 9 || month % 2 == 0 && month >= 8){
            return 31;
        }else{
            return 30;
        }
    }
}
