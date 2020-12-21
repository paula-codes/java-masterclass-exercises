import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (count < 11) {
            System.out.println("Enter a number #" + count);

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();
                scanner.nextLine();
                count += number;
            } else {
                System.out.println("Invalid value");
            }
        }

        scanner.close();

    }
}
    
