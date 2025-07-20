import java.util.Scanner;

public class Question5_NearestMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of numbers separated by a space");
        String[] inArr = sc.nextLine().split(" ");
        int[] nums = new int[inArr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inArr[i]);
        }
        System.out.println(getNearestMinimumDist(nums));
    }

    private static int getNearestMinimumDist(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minDist = Integer.MAX_VALUE;;
        int currMinIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                if (currMinIndex != -1)
                    minDist = i - currMinIndex < minDist ? i - currMinIndex : minDist;
                min = nums[i];
                currMinIndex = i;
            }
        }
        return minDist;
    }
}
