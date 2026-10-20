import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums;
        nums = new int[n];

        for (int i=0; i<n; i++) {
            nums[i] = 4+(3*i);
            System.out.print(nums[i]+" ");
        }
    }
}

