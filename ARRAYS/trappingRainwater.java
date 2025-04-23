package ARRAYS;

public class trappingRainwater {
    public static int TrappedRainwater(int height[]) {
        int n = height.length;
        // Calculating the left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculating the right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // Loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 5, 2, 0, 9, 3, 2, 7 };
        System.out.println(TrappedRainwater(height));
    }
}
