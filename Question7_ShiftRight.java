import java.util.*;

public class Question7_ShiftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of words separated by arrow(->)");
        List<String> inList = Arrays.asList(sc.nextLine().split("->"));
        System.out.println("Enter shift distance");
        int shiftDistance = sc.nextInt();
        System.out.println(shiftWords(inList, shiftDistance));
    }

    private static List<String> shiftWords(List<String> inList, int dist) {
        List<String> words = new ArrayList<>(inList.stream().filter(Objects::nonNull).toList());
        Collections.rotate(words, dist);
        words.addAll(inList.stream().filter(Objects::isNull).toList());
        return words;
    }
}
