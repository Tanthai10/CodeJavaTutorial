public class Result1To100 {
    public static void main(String[] args) {
        int iWhile = 1, sum = 0;
        while (iWhile <= 100){
            System.out.println("Result in whileloop : "+iWhile);
            iWhile += 1;
            sum += iWhile;
        }
        System.out.println("total result : " +sum);
    }
}
