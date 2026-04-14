public class FindMax { // 類別名稱必須跟檔名 FindMax.java 一致
    public static void main(String[] args) {
        int[] scores = {3, 9, 5, 2}; // 測試資料
        int result = findMax(scores);
        System.out.println("Max Value: " + result);
    }

    // 這是你要寫的第二題方法
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
