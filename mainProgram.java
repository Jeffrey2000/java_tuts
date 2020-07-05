import java.lang.reflect.Array;

public class mainProgram {
    public static void main(String[] args){
        //Switch statements are especially useful for checking the changing values of a single variable

        printDayOfTheWeek(0);
        altDays(1);
    }

    private static void printDayOfTheWeek(int day){
        String outstring;
        switch (day){
            case 0:
                outstring = "Monday";
                break;
            case 1:
                outstring =  "Tuesday";
                break;
            case 2:
                outstring ="Wednesday";
                break;
            case 3:
                outstring="Thursday";
                break;
            case 4:
                outstring= "Friday";
                break;
            case 5:
                outstring = "Saturday";
                break;
            case 6:
                outstring = "Sunday";
                break;
            default:
                outstring = "Invalid day";
        }

        System.out.println(outstring);
    }

    //Alternative solution without switch case, using the selection model
    private static String[] daysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday"};

    private static void altDays(int thisday){
        String outstring;
        outstring = daysArray[thisday];
        System.out.println(outstring);
    }



}
