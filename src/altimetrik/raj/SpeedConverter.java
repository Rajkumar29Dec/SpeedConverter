package altimetrik.raj;

public class SpeedConverter {


    public static void main(String[] args) {
	    double KiloMetersPerHour=0.0d;
	    printConversion(KiloMetersPerHour);

    }
    public static long toMilesPerHour(double kiloMetersPerHour) {
        if(kiloMetersPerHour>0){
            return Math.round(kiloMetersPerHour/1.609d);
        }
        else if(kiloMetersPerHour==0){
            return 0;
        }
        return -1;
    }

    public static void printConversion(double KiloMetersPerHour){
        long mileperhour=toMilesPerHour(KiloMetersPerHour);
        if(KiloMetersPerHour<0){
            System.out.println("Invalid Value");
        }
        else if(KiloMetersPerHour==0){
            System.out.println(KiloMetersPerHour+" km/h = "+0+" mi/h");

        }
        else{
            System.out.println(KiloMetersPerHour+" km/h = "+mileperhour+" mi/h");
        }
    }
//
//    private static long toMilePerHour(double kiloMetersPerHour) {
//        if(kiloMetersPerHour>0){
//            return Math.round(kiloMetersPerHour/1.609d);
//        }
//        return -1;
//    }
//
//    private static void PrintConversion(double KiloMetersPerHour){
//        mileperhour=toMilePerHour(KiloMetersPerHour);
//        if(KiloMetersPerHour<0){
//            System.out.println("Invalid Value");
//        }
//        else{
//            System.out.println(KiloMetersPerHour+"km/h = "+mileperhour+" mi/h");
//        }
//    }
}
