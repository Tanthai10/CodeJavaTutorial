
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int inputAge ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        inputAge = scan.nextInt();
        System.out.println("You entered : " +inputAge);
        if(inputAge < 20)
            System.out.println("you are still young");
        System.out.println("Good Bye");
    }
}
