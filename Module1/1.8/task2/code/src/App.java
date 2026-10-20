import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, sum = 0;
        boolean haveNums = false;

        for (int i=0; i<n; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                sum += x;
                haveNums = true;
            }
        }

        System.out.println((!haveNums ? "NO" : sum));
    }
}
