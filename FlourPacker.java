
public class FlourPacker {
//	public static boolean canPack(int bigCount, int smallCount, int goal) {
//		if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
//		if(bigCount > 0) {
//			if(bigCount > 0 && goal / 5 == bigCount) { //check if used all of the bag
//				if(goal - bigCount * 5 > 0) { //check for remainder
//					if(smallCount >= (goal - bigCount * 5)) { //check if smallbag is greater than goal
//						return true;
//					}else {
//						return false;
//					}
//				}else {
//					return true;
//				}
//			}else {
//				return false;
//			}
//			
//		}else {
//			return (smallCount >= goal);
//		}
//	}
    public static boolean canPack(int bigCount, int smallCount, int goal) {
    	 
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int sum = (bigCount * 5) + smallCount;
 
            if (sum < goal) {
                return false;
            } else return (goal % 5) <= smallCount;
        }
        return false;
    }
}
