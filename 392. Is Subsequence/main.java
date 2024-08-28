import java.util.Scanner;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int tIndex = 0;

        for (char ch : s.toCharArray()) {
            while (tIndex < t.length() && t.charAt(tIndex) != ch) {
                tIndex++;
            }

            if (tIndex == t.length()) {
                return false;
            }
            
            tIndex++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter the first string (s):");
        String s = scanner.nextLine();

        System.out.println("Enter the second string (t):");
        String t = scanner.nextLine();

        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result);

        scanner.close();
    }
}
