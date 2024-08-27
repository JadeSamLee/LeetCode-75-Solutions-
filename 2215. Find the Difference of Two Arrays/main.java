import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> findDifference(int[] arr1, int[] arr2) {   
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], 1);
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                list.add(arr1[i]);
                map.put(arr1[i], 1);
            }
        }
        result.add(list);
        
        list = new ArrayList<>();
        map = new HashMap<>();
        
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], 1);
        }
        
        for (int i = 0; i < arr2.length; i++) {
            if (!map.containsKey(arr2[i])) {
                list.add(arr2[i]);
                map.put(arr2[i], 1);
            }
        }
        result.add(list);
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in arr1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of arr1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in arr2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of arr2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        List<List<Integer>> result = solution.findDifference(arr1, arr2);

        System.out.println("Unique elements in arr1 but not in arr2: " + result.get(0));
        System.out.println("Unique elements in arr2 but not in arr1: " + result.get(1));

        scanner.close();
    }
}
