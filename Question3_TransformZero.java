import java.util.Arrays;
import java.util.Scanner;

public class Question3_TransformZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of numbers separated by a space");
        String[] inArr = sc.nextLine().split(" ");
        int[] nums = new int[inArr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inArr[i]);
        }
        System.out.println(checkIfTransformed(nums));
    }

    private static int checkIfTransformed(int[] nums) {
        if (nums.length > 1) {
            transformList(nums, nums.length-1);
            for (int i = 1; i < nums.length; i++ ) {
                if (nums[i] != 0 ) {
                    return 0;
                }
            }
        }
        return 1;
    }

    private static void transformList(int[] nums, int index) {
        int newNum = nums[index] - nums[index - 1];
        if (index == 1 && newNum == 0) {
            nums[index] = 0;
            return;
        }
        else if (index == 1 && newNum < 0) {
            return;
        }
        else if (index == 1) {
            nums[index] = newNum;
            transformList(nums, nums.length-1);
        }
        else if (newNum < 0) {
            transformList(nums, index - 1);
        }
        else if (newNum == 0) {
            nums[index] = newNum;
            transformList(nums, index - 1);
        } else {
            nums[index] = newNum;
            transformList(nums, index);
        }
    }
}
