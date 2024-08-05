import java.util.*;
public class PayArray {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payrate;
        double grosspay;
        int [] hours = new int [EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours worked by " +EMPLOYEES+ "employees who all earn ");
        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.print("Employees #" +(index + 1)+ " : ");
            hours[index] = in.nextInt();
            
        }
        System.out.print("Enter the hourly pay rate for each employee: ");
        payrate = in.nextDouble();
        for (int index = 0; index < EMPLOYEES; index++) {
            grosspay = hours[index] + payrate;
            System.out.println("Employee #" +(index + 1)+ " : $"+grosspay);
            
        }
    }
}
