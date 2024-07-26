public class testLogic {
    public static void main(String[] args) {
        /*
         * > มากกว่า
         * < น้อยกว่า
         * == เท่ากับ
         * >= มากกว่าหรือเท่ากับ
         * <= น้อยกว่าหรือเท่ากับ
         * != ไม่เท่ากับ
         * ตัวดำเนินการ
         * true/false
         * && and และ
         * true && true = true
         * false && true = false
         * false && false = false
         * or หรือ
         * not ไม่
         */
        int x = 6, y = 9;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x >= y);
        System.out.println(x != 6);
        System.out.println((x < y) && (y > 3));
        System.out.println((x == 5) || (y >2));
        System.out.println(!(y > x));
    }
}
