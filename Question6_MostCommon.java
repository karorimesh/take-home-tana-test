import java.util.*;
import java.util.stream.Collectors;

public class Question6_MostCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of words separated by a space");
        String[] inArr = sc.nextLine().split(" ");
        System.out.println(getTopCommon(inArr));
    }

    private static List<String> getTopCommon(String[] inArr) {
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : inArr) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();
    }
}
