import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        int[] pNums, nNums, nums;
        nums = new int[n];
        pNums = new int[n];
        nNums = new int[n];
        int pNumsQ = 0;
        int nNumsQ = 0;
        int o = 0;

        for (int i=0; i<n; i++) {
            m = sc.nextInt();
            if (m >= 0) {
                pNums[pNumsQ] = m;
                pNumsQ++;
            } else {
                nNums[nNumsQ] = m;
                nNumsQ++;
            }
        }
        for (int i=o; i<nNumsQ; i++) {
            nums[o] = nNums[o];
            o++;
        }

        for (int i=o; i<pNumsQ+o; i++) {
            nums[i] = pNums[i-o];
        }

        for (int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}