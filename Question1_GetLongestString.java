import java.util.Scanner;

public class Question1_GetLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of valid characters");
        String validCharacters = sc.nextLine();
        System.out.println("Enter a list of space separated string");
        String[] strings = sc.nextLine().split(" ");
        System.out.println(getLongestString(validCharacters, strings));
    }
    public static String getLongestString(String validCharacters, String[] strings) {
        int longestStringLength = 0;
        String longestString = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                if (validCharacters.indexOf(strings[i].charAt(j)) == -1)
                    break;
                if (j + 1 < strings[i].length() && strings[i].charAt(j) == strings[i].charAt(j + 1))
                    break;
            }
            if (strings[i].length() > longestStringLength) {
                longestStringLength = strings[i].length();
                longestString = strings[i];
            }
        }
        return longestString;
    }
}