import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            int sum = 0;
            for (i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if ((sum == number)&&(number>0)) {
                System.out.println("This number is a perfect number.");

            } else if ((!(sum == number)&&(number>0))){
                System.out.println("This number is not a perfect number.\n" +
                        "Try a different number.");
            }
        } while (number > 0);
        System.out.println("Invalid Input! Enter a positive number.");
    }
}
