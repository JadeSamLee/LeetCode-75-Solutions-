import java.util.Scanner;

class Solution {
    public boolean canPlaceFlowers(int[] bed, int numFlowers) {
        int placed = 0;
        for (int i = 0; i < bed.length; i++) {
            if (bed[i] == 0) {
                boolean leftEmpty = (i == 0) || (bed[i - 1] == 0);
                boolean rightEmpty = (i == bed.length - 1) || (bed[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    bed[i] = 1;
                    placed++;
                }
            }
        }
        return placed >= numFlowers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of plots in the flowerbed: ");
        int size = scanner.nextInt();
        
        int[] flowerbed = new int[size];
        System.out.println("Enter the values for the flowerbed (0 for empty, 1 for occupied):");
        for (int i = 0; i < size; i++) {
            flowerbed[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of flowers to place: ");
        int numFlowers = scanner.nextInt();
        
        Solution solution = new Solution();
        boolean result = solution.canPlaceFlowers(flowerbed, numFlowers);
        
        System.out.println("Can place flowers: " + result);
        
        scanner.close();
    }
}
