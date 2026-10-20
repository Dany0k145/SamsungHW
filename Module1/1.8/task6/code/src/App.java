import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums;
        nums = new int[n];
        int serNum = 0;
        int serQ = 0;
        int tSerNum, tSerQ;


        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            tSerQ = 0;
            tSerNum = nums[i];
            for (int o=0; o<n; o++) {
                if (nums[o] == tSerNum) {
                    tSerQ++;
                }
            }
            if (tSerQ > serQ) {
                serQ = tSerQ;
                serNum = tSerNum;
            }
        }
        System.out.println(serNum);
    }
}