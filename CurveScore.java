public class CurveScore {
    public static void main(String[] args) {
        // 建立一個臨時類別，避免跟其他檔案衝突
        LocalStudent tom = new LocalStudent("Tom", 55);
        curve(tom);
        System.out.println(tom.name + ": " + tom.score);
    }

    static void curve(LocalStudent s) {
        if (s.score < 60) {
            s.score += 10;
        }
    }
}

// 換個名字叫 LocalStudent，就不會跟別題的 Student 撞名
class LocalStudent {
    String name;
    int score;
    LocalStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
