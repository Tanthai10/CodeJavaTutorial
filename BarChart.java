
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Input Data : ");
        x = in.nextInt();
        bar(x);
    }
    public static void bar(int data){
        for(int x = 1; x <= data; x++){
            System.out.print("*");
        }
    System.out.println();
    }
}
