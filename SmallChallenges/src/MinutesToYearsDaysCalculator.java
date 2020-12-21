public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long days = minutes / (60 * 24);
            long leftover_days = days % 365; // calculates days
            int years = (int) (days / 365);

            if (leftover_days == 0) {
                System.out.println(minutes + " min = " + years + " y and " + "0 d");
            } else {
                System.out.println(minutes + " min = " + years + " y and " + leftover_days + " d");
            }
        }

    }
}
