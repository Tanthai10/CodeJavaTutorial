public class BasicArray {
    public static void main(String[] args) {
        final  int LIMIT = 15, MULTIPLE = 10;
        int [ ] list = new int[LIMIT];
        for (int index = 0; index < LIMIT; index++) {
            list[index] = index * MULTIPLE;
        }
        list[5] = 999;
        for(int value : list) {
            System.out.println(value+" ");
        }
        int sum = 0;
        System.out.println();
        for(int value : list) {
            sum += value;
        }
        System.out.println("Sum = : " +sum);
    }
}