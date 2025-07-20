import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Question4_UniqueProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of products separated by a space");
        String[] inArr = sc.nextLine().split(" ");
        System.out.println(getFirstUniqueProduct(inArr));
    }

    private static String getFirstUniqueProduct(String[] inArr) {
        LinkedHashMap<String, Integer> prodCount = new LinkedHashMap<>();

        for (String prod : inArr) {
            prodCount.put(prod, prodCount.getOrDefault(prod, 0) + 1);
        }
        for (Map.Entry<String, Integer> pc : prodCount.entrySet()) {
            if (pc.getValue() == 1) {
                return pc.getKey();
            }
        }
        return null;
    }


}
