import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums;
        nums = new int[n];

        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int sNum = sc.nextInt();
        boolean numFound = false;
        sc.close();
        for (int i=0; i<n; i++) {
            if (nums[i] == sNum) {
                System.out.println(i+1);
                numFound = true;
                break;
            }
        }

        if (!numFound) {
            System.out.println("NO");
        }

    }
}