public class EX5A1 {

    public static double calArea(double base, double height) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        double base = 10.0; 
        double height = 5.0; 
        
        double area = calArea(base, height); 
        System.out.println("Area of the triangle is: " + area); 
    }
}
