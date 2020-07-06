public class NumberInWord {
        public static void printNumberInWord(int number){
            String out;
            if(number==0){
                out = "ZERO";
            }else if (number==1){
                out = "ONE";
            }else if (number==2){
                out = "TWO";
            }else if (number==3){
                out = "THREE";
            }else if (number==4){
                out = "FOUR";
            }else if (number==5){
                out = "FIVE";
            }else if (number==6){
                out = "SIX";
            }else if (number==7){
                out = "SEVEN";
            }else if (number==8){
                out = "EIGHT";
            }else if (number==9){
                out = "NINE";
            }else{
                out = "OTHER";
            }
            System.out.println(out);
        }

    }

