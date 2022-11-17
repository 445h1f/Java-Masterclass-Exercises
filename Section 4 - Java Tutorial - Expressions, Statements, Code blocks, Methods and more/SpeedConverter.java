public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.5);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(72.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        double kmhToMph = 1.609d;

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double converted = kilometersPerHour / kmhToMph;
            return Math.round(converted);
        }

    }


    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0){
            System.out.println("invalid value");
        } else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }

}
mkdir "Section 4 - Java Tutorial - Expressions, Statements, Code blocks, Methods and more"