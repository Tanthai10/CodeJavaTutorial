import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        String name;
        int hours;
        double payrate;
        double grosspay;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name : ");
        name = keyboard.nextLine();
        System.out.println("How many hour did you work this week");
        hours = keyboard.nextInt();
        System.out.println("What is your hourly pay rate");
        payrate = keyboard.nextDouble();
        grosspay = hours * payrate;
        System.out.println("Hello " +name);
        System.out.println("Your gross pay is " +grosspay);

    }
}
