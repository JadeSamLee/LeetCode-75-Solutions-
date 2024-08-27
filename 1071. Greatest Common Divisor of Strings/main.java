import java.util.Scanner;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
        } else {
            return "";
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        Solution solution = new Solution();
        String result = solution.gcdOfStrings(str1, str2);
        
        System.out.println(result);
        
        scanner.close();
    }
}
