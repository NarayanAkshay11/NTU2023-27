import java.util.Scanner;

class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = input.nextInt();

        if (height == 0) {
            System.out.println("Error input!!");
        } else {
            for (int i = 1; i <= height; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < i; j++) {
                        if (j % 2 == 0) {
                            System.out.print("B");
                        } else {
                            System.out.print("A");
                        }
                    }
                } else {
                    for (int j = 0; j < i; j++) {
                        if (j % 2 == 0) {
                            System.out.print("A");
                        } else {
                            System.out.print("B");
                        }
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}
