import java.util.*;

public class CheckDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words separated by space:");
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");
        Set<String> wordSet = new HashSet<>();

        boolean hasDuplicate = false;
        for (String word : words) {
            if (!wordSet.add(word)) {
                hasDuplicate = true;
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("Duplicate word found.");
        } else {
            System.out.println("No duplicate words.");
        }
    }
}
