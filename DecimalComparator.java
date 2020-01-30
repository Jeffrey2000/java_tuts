public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if(num1 < 0 || num2 < 0){
            return Math.ceil(num1 * 1000) == Math.ceil(num2 * 1000);
        }else{
            //ulitlised the technique learned from previous exercise in returning the boolean expression
            // as opposed to checking and returning either true or false
            return Math.floor(num1 * 1000) == Math.floor(num2 * 1000);
        }
    }
}
