import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        // Menu-driven program
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            // Switch case to call appropriate methods
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println("Enter two integers:");
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    System.out.println("Quotient: " + divide(m, n));
                    break;
                case 3:
                    System.out.println("Enter two integers:");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    System.out.println("Remainder: " + modulus(m, n));
                    break;
                case 4:
                    System.out.println("Enter an integer:");
                    int num = sc.nextInt();
                    System.out.println("Count of digits: " + countDigits(num));
                    break;
                case 5:
                    System.out.println("Enter an integer and the digit to find:");
                    num = sc.nextInt();
                    int digit = sc.nextInt();
                    System.out.println("Position: " + position(num, digit));
                    break;
                case 6:
                    System.out.println("Enter an integer:");
                    long lnum = sc.nextLong();
                    System.out.println("Odd digits: " + extractOddDigits(lnum));
                    break;
                case 7:
                    System.out.println("Program terminating ....");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice < 7);
        
        sc.close();
    }

    // Method 3.2: Multiplication test with random numbers
    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        int correctCount = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = (int) (Math.random() * 9) + 1;
            int num2 = (int) (Math.random() * 9) + 1;

            System.out.println("How much is " + num1 + " times " + num2 + "?");
            int answer = sc.nextInt();

            if (answer == num1 * num2) {
                correctCount++;
            }
        }

        System.out.println(correctCount + " answers out of 5 are correct.");
    }

    // Method 3.3: Division by subtraction
    public static int divide(int m, int n) {
        int count = 0;
        while (m >= n) {
            m -= n;
            count++;
        }
        return count;
    }

    // Method 3.4: Modulus using division by subtraction
    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    // Method 3.5: Count the number of digits in an integer
    public static int countDigits(int n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    // Method 3.6: Position of a digit in a number (from the right, 1-based)
    public static int position(int n, int digit) {
        int pos = 1;

        while (n > 0) {
            if (n % 10 == digit) {
                return pos;
            }
            n /= 10;
            pos++;
        }

        return -1;
    }

    // Method 3.7: Extract odd digits and return as a new number
    public static long extractOddDigits(long n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }

        long result = 0;
        long factor = 1;

        while (n > 0) {
            long digit = n % 10;
            if (digit % 2 != 0) {
                result += digit * factor;
                factor *= 10;
            }
            n /= 10;
        }

        if (result == 0) {
            return -1;
        } else {
            return result;
        }
    }
}
