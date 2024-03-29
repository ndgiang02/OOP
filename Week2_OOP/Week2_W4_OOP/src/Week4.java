public class Week4 {

    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }


    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static String calculateBMI(double weight, double height) {
        double bmi = (double) Math.round(10 * weight / Math.pow(height, 2)) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        }
        if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        }
        if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }

}
