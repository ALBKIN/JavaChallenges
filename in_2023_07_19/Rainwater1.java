package in_2023_07_19;

public class Rainwater1 {

    public int naiveSolution(int[] heights) {
        int totalWater = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            int leftBound = 0;
            int rightBound = 0;

            for (int j = 0; j <= i; j++) {
                leftBound = Math.max(leftBound, heights[j]);
            }
            for (int j = i; j < heights.length; j++) {
                rightBound = Math.max(rightBound, heights[j]);
            }
            totalWater += Math.min(leftBound, rightBound) - heights[i];
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] testArr = {4, 2, 1, 3, 0, 1, 2};
        Rainwater1 rainwater1 = new Rainwater1();
        System.out.println(rainwater1.naiveSolution(testArr));
    }
}
