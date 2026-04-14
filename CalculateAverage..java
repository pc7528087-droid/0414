 class CalculateAverage {
    public static void main(String[] args) {
        // 所有的邏輯都要寫在 main 方法的大括號內
        int[] scores = {70, 80, 90};
        int sum = 0;
        
        for (int score : scores) {
            sum += score;
        }
        
        // 轉型成 double 才能計算出 80.0
        double average = (double) sum / scores.length;
        
        System.out.println("Average: " + average);
    }
}