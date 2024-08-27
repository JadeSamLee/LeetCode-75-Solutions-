import java.util.Scanner;

class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (start < end) {
            while (start < end && vowels.indexOf(str[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(str[end]) == -1) {
                end--;
            }
            if (start < end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Solution solution = new Solution();
        String result = solution.reverseVowels(input);
        
        System.out.println("String with vowels reversed: " + result);
        
        scanner.close();
    }
}
