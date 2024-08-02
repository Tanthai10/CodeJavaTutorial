public class DemoArg {
    public static void main(String[] args) {
        System.out.println("Start in main.");
        int tesetNum = 10, total;
        displayvalue(5);
        displayvalue(tesetNum);
        displayvalue(tesetNum * 5);
        total = showSum(3,4);
        System.out.println("total have value : " +total);
    }
    public static void displayvalue(int num){
        System.out.println("Value is " +num);
    }
    public static int showSum(int x,int y){
        int sum;
        sum = x + y;
        return sum;

    }
}
