import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float x, y = 0;
        float sum = 0;
        boolean haveNums = false;

        for (int i=0; i<n; i++) {
            x = sc.nextInt();
            if (x % 2 != 0) {
                sum += x;
                haveNums = true;
                y+=1;
            }
        }

        System.out.println((!haveNums) ? "NO" : (Math.round((sum/y) * 100.0) / 100.0));
    }
}