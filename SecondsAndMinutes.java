/*
 * Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return Invalid value in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format XXh YYm ZZs where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return Invalid value if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.

Tips:
	Use int or long for your number data types is probably a good idea.
	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	Methods should be static as we have used previously.

Bonus:
	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	Create a new console project and call it SecondsAndMinutesChallenge

*/

public class SecondsAndMinutesChallenge{


    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(long minutes, long seconds){
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            long hours = minutes / 60;
            minutes = minutes % 60;

            // formatting hours, minutes and seconds with leading 0 if less than 10
            String hourString = hours + "h";
            if (hours < 10){
                hourString = "0" + hourString;
            }

            String minuteString = minutes + "m";
            if (minutes < 10){
                minuteString = "0" + minuteString;
            }

            String secondString = seconds + "s";
            if (seconds < 10){
                secondString = "0" + secondString;
            }

            String durationString = hourString + " " + minuteString + " " + secondString;
            return durationString;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }


    public static String getDurationString(long seconds){
        if (seconds >= 0){
            long minutes = seconds / 60;
            long secondsLeft = seconds % 60;

            return getDurationString(minutes, secondsLeft);
        } else {
            return INVALID_VALUE_MESSAGE;
        }


    }

    public static void main(String[] args) {
        System.out.println(getDurationString(120, 23));
        System.out.println(getDurationString(7223L));
        System.out.println(getDurationString(-2));
    }
}
