public class SpeedConverter {

    public void printConversion(double kiloMetersPerHour){
        System.out.println(kiloMetersPerHour + " km/h = " + toMilesPerHour(kiloMetersPerHour)  + " mi/h");
    }

    public long toMilesPerHour(double kiloMetersPerHour){
        if (kiloMetersPerHour < 0){
            return -1;
        }else{
            return Math.round(kiloMetersPerHour / 1.609);
        }
    };
}
