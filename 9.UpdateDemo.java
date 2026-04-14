public class UpdateDemo {

    // 1. 使用靜態內部類別，避免與其他練習題的 Student 類別衝突
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        // 2. 建立 Tom 物件，初始分數 85
        Student tom = new Student("Tom", 85);
        
        // 3. 呼叫更新分數的方法
        updateScore(tom, 95);
        
        // 4. 印出結果檢查是否成功更新
        System.out.println(tom.name + ": " + tom.score);
    }

    // 5. 更新分數的方法 (這裡拿掉 public 以避免警告)
    static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }
}
