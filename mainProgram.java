public class mainProgram {
    public static void main(String[] args){
        //Gaining Basic understanding of method overloading
        System.out.println(calcFeetAndInchesToCentimeters(6,2));
    };

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >=0 && (inches >=0 && inches <=12)){
            inches+= feet * 12;
            double centimeters = inches * 2.54;
            return centimeters;
        }
        return -1;
    }


    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches >= 0){
            int remInches = inches % 12;
            int feet = (inches  - remInches) / 12;
            return calcFeetAndInchesToCentimeters(feet, remInches);
        }
        return -1;
    }
}
