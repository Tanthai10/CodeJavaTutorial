public class testdowwhile {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("i in for: " +i);
        }
        int iwhile = 1;
        while(iwhile <= 10){
            System.out.println("iwhile in whine: " +iwhile);
            iwhile++;
        }

        int counter = 1;
        do{
            System.out.println("counter in dowwhile: " +counter);
            counter++;
        }
        while(counter <= 10);
    }
}
