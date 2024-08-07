public class LengthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        System.out.println("setlength method");
        box.setLength(10.0);
        box.setwidth(20.0);
        System.out.println("The box length is "+box.getLength());
        System.out.println("The box width is "+box.getwidth());
        System.out.println("The box area is "+box.getArea());
        System.out.println("Done");
    }
}
