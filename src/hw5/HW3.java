package hw5;

public class HW3 {

    public static void main(String[] args) {
        int[][] intArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] doubleArray = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };

        int maxInt = maxElement(intArray);
        double maxDouble = maxElement(doubleArray);

        System.out.println("最大整數元素：" + maxInt);
        System.out.println("最大浮點數元素：" + maxDouble);
    }

    // 找出二維整數陣列的最大值
    public static int maxElement(int[][] x) {
        int max = Integer.MIN_VALUE;

        for (int[] row : x) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }

    // 找出二維浮點數陣列的最大值
    public static double maxElement(double[][] x) {
        double max = Double.NEGATIVE_INFINITY;

        for (double[] row : x) {
            for (double value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }
}