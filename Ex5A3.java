public class Ex5A3 {
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        int num1 = 50; 
        int num2 = 20; 
        int max = findMax(num1, num2);
        System.out.println("The maximum value is: " + max);
    }
}
