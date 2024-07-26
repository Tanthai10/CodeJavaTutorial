

public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";

        /*  Method Basic
        1.toUpperCase()พิมพ์ใหญ่
        2.toLowerCase()พิมพ์เล็ก
        3.length()เก็บความยาวของสตริง
        4.charAT()บอกให้เก็บตัวอักษรตามจำนวนพารามีเตอร์
        */
        String upper = message.toUpperCase();
        System.out.println(upper);

        String lower = message.toLowerCase();
        System.out.println(lower);

        int stsize;
        stsize = message.length();
        System.out.println(message+" has " +stsize+ " characters ");

        char charat1 = message.charAt(2);
        System.out.println(charat1);
    }
}
