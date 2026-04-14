public class SumArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(sum(input));
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}
