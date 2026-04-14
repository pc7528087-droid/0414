public class FindMin {
    public static void main(String[] args) {
        int[] input = {70, 85, 62, 90, 58};
        int min = input[0];
        for (int s : input) {
            if (s < min) {
                min = s;
            }
        }
        System.out.println(min);
    }
}
