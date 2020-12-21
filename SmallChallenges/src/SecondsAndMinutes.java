public class SecondsAndMinutes {

    public static String getDurationString(long mins, long secs){
        if ((mins <0) || (secs < 0) || (secs >59)) {
            return "Invalid value";
        }

        long hours = mins / 60;
        long remainingMins = mins % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minsString = remainingMins + "m";
        if (remainingMins < 10) {
            minsString = "0" + minsString;
        }

        String secsString = secs + "s";
        if (secs < 10) {
            secsString = "0" + secsString;
        }



        return hoursString + " " + minsString + " " + secsString + "";
    }

    private static String getDurationString(long secs) {
        if (secs < 0){
            return "Invalid value";
        }

        long mins = secs / 60;
        long remainingSecs = secs % 60;
        return getDurationString(mins, remainingSecs);
    }
}
