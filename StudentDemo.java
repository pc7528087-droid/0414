class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student tom = new Student("Tom", 85);
        System.out.println(tom.name + ": " + tom.score);
    }
}
