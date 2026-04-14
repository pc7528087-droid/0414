public class StudentArray {
    
    // 將類別定義在裡面，並加上 static
    static class Student {
        String name;
        int score;
        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        // 建立學生陣列
        Student[] students = {
            new Student("Tom", 85),
            new Student("Mary", 90),
            new Student("John", 78)
        };

        // 使用迴圈列印
        for (Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }
    }
}
