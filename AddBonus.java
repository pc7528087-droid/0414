public class AddBonus {
    // 程式的起點
    public static void main(String[] args) {
        int[] myScores = {60, 70}; // 測試資料
        
        // 呼叫你寫的方法
        addBonus(myScores);
        
        // 印出結果檢查
        System.out.print("After Bonus: {");
        for (int i = 0; i < myScores.length; i++) {
            System.out.print(myScores[i] + (i == myScores.length - 1 ? "" : ", "));
        }
        System.out.println("}");
    }

    // 這是題目要求你寫的方法
    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
        }
    }
}
