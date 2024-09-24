import java.util.Scanner;

class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start = input.nextInt();
        System.out.println("Enter ending value: ");
        int end = input.nextInt();
        System.out.println("Enter increment value: ");
        int increment = input.nextInt();

        if (start > end) {
            System.out.println("Error input!!");
        } else {
            System.out.println("Using for loop:");
            System.out.println("US$   S$");
            for (int i = start; i <= end; i += increment) {
                System.out.println(i + "   " + (i * 1.82));
            }

            System.out.println("Using while loop:");
            System.out.println("US$   S$");
            int i = start;
            while (i <= end) {
                System.out.println(i + "   " + (i * 1.82));
                i += increment;
            }

            System.out.println("Using do/while loop:");
            System.out.println("US$   S$");
            i = start;
            do {
                System.out.println(i + "   " + (i * 1.82));
                i += increment;
            } while (i <= end);
        }

        input.close();
    }
}
