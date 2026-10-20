import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums;
        nums = new int[n];
        int stor;

        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i=0; i<n/2; i++) {
            stor = nums[i];
            nums[i] = nums[n-(1*i+1)];
            nums[n-(1*i+1)] = stor;
        }

        for (int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}