public class OverloadDemo {
    int x;
    OverloadDemo() {
        System.out.println("Insert OverloadDemo(). ");
        x = 0;
    }
    OverloadDemo(int i) {
        System.out.println("Insert OverloadDemo(int). ");
        x = i;
    }
    OverloadDemo(double d) {
        System.out.println("Insert OverloadDemo(double). ");
        x = (int)d;
    }
    OverloadDemo(int i,int j) {
        System.out.println("Insert OverloadDemo(int,int). ");
        x = i * j;
    }
    
}
