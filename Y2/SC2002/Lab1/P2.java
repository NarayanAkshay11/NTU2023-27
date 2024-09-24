import java.util.Scanner;

class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = input.nextInt();
        System.out.println("Enter merit points: ");
        int merit = input.nextInt();

        if (salary >= 700 && salary <= 799) {
            if (merit < 20) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade A");
            }
        } else if (salary >= 600 && salary <= 649) {
            if (merit < 10) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade B");
            }
        } else if (salary >= 500 && salary <= 599) {
            System.out.println("Grade C");
        } else {
            System.out.println("Invalid salary range");
        }

        input.close();
    }
}
