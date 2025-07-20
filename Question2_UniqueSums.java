import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2_UniqueSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of numbers separated by a space");
        String[] inArr = sc.nextLine().split(" ");
        System.out.println("Enter an expected sum ");
        int result = sc.nextInt();
        int[] nums = new int[inArr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inArr[i]);
        }
        System.out.println(getUniqueSums(result, nums));
    }

    private static String getUniqueSums(int result, int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findPermutations(nums, result, 0, new ArrayList<>(), res);
        return res.size() + " " + res.toString();
    }

    private static void findPermutations(int[] nums, int result, int start, List<Integer> current, List<List<Integer>> res) {
        if (result == 0){
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > result)
                break;
            current.add(nums[i]);
            findPermutations(nums, result-nums[i], i + 1, current, res);
            current.removeLast();
        }
    }
}
