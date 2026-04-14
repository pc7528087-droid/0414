public class CountPass {
    public static void main(String[] args) {
        int[] input = {45, 60, 80, 59, 100};
        int count = 0;
        for (int s : input) {
            if (s >= 60) {
                count++;
            }
        }
        System.out.println("Number of passing students: " + count);
    }
}
