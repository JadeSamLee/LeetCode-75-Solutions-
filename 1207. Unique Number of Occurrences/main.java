import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashSet<Integer> occurrenceSet = new HashSet<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Integer frequency : frequencyMap.values()) {
            if (!occurrenceSet.add(frequency)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean result = solution.uniqueOccurrences(arr);
        System.out.println("Are the occurrences of each number unique? " + result);
        
        scanner.close();
    }
}
