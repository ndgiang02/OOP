import java.sql.SQLOutput;

public class Solution {

    /*ham tinh UCLN */

    public static int gcd(int a, int b) {
        // Kiểm tra trường hợp đặc biệt: a hoặc b bằng 0
        if (a == 0 || b == 0) {
            return Math.abs(a + b); // Trả về giá trị tuyệt đối của tổng a và b
        }
        int temp;
        // Sử dụng thuật toán Euclid để tìm ƯCLN
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        if(a < 0)
            a = -a;


        return a; // Trả về ƯCLN
    }


    public static void main ( String [] args) {
        int f = gcd(3, -15);
        System.out.print(f);
    }

}