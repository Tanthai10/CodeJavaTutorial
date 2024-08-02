import java.util.Scanner;

public class EX5A4 {
    public static void check(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int number = scanner.nextInt();
    
        check(number);
    }

}
