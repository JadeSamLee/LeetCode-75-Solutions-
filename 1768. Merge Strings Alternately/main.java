import java.util.Scanner;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.max(word1.length(), word2.length());
        StringBuilder alternatelyMerged = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            if (i < word1.length()) {
                alternatelyMerged.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                alternatelyMerged.append(word2.charAt(i));
            }
        }

        return alternatelyMerged.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();
        
        Solution solution = new Solution();
        String result = solution.mergeAlternately(word1, word2);
        
        System.out.println("Merged string: " + result);
        
        scanner.close();
    }
}
