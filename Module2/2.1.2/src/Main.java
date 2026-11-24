import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));

        byte byteNum = (byte)num;
        short shortNum = (short)num;
        int checkNum = (int)byteNum;
        if (num == checkNum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        checkNum = (int)shortNum;
        if (num == shortNum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
