public class FeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 && inches > 12)) {
            return -1;
        } else {
            double centimeters = ((feet * 12) * 2.54) + (inches * 2.54);
            return centimeters;

        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;

        }

        return inches;
    }
}
