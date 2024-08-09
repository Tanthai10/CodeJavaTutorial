
public class ConstructorDemo {
    public static void main(String[] args) {
        ContRectangle boxA = new ContRectangle(8.0, 12.0);
        ContRectangle boxB = new ContRectangle();

        System.out.println("The boxA length is " +boxA.getLength());
        System.out.println("The boxA width is " +boxA.getWidth());
        System.out.println("The boxA Area is " +boxA.getArea());
        System.out.println();
        System.out.println("The boxB length is " +boxB.getLength());
        System.out.println("The boxB width is " +boxB.getWidth());
        System.out.println("The boxB Area is " +boxB.getArea());
    }
    
}
