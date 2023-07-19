package in_2023_07_19;

public class Rainwater2 {

    public int efficientSolution(int[] heights) {
        int totalWater = 0;
        int leftPointer = 0;
        int rightPointer = heights.length - 1;
        int leftBound = 0;
        int rightBound = 0;

        while (leftPointer < rightPointer) {
            if (heights[leftPointer] <= heights[rightPointer]) {
                leftBound = Math.max(heights[leftPointer], leftBound);
                totalWater += leftBound - heights[leftPointer];
                leftPointer++;
            } else {
                rightBound = Math.max(heights[rightPointer], rightBound);
                totalWater += rightBound - heights[rightPointer];
                rightPointer--;
            }
        }
        return totalWater;
    }

    public static void main(String[]args) {
        // heights: the array representing the histogram
        int [] heights = new int[]{4, 2, 1, 3, 0, 1, 2};
        Rainwater2 rainWater2 = new Rainwater2();
        System.out.println("Amount of water captured: " + rainWater2.efficientSolution(heights));
    }
}
