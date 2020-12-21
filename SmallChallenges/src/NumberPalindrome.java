public class NumberPalindrome {

    public static boolean isPalindrome(int number){


        int reverse = 0;

        int originalNum = number;



        while (number != 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;

        }

      if (originalNum == reverse) {
          return true;
      } else {
          return false;
      }
    }
}
