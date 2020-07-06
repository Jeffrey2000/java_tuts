public class numberOfDaysInMonth extends LeapYear{
    //Using inheritance I can avoid duplicate code
    public int getDaysInMonth(int month, int year){
        if ( (1 > month || month > 12) || (1 > year || year > 9999) ){
            return -1;
        }else if(month == 2){
            if(isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }else if( (month % 2 != 0 && month < 9) || (month % 2 == 0 && month > 7) ){
            return 31;
        }else{
            return 30;
        }
    }
}
