public class maxsumofcon {
    // find maximum sum of k consecutive elements
    // - given a array on size N and also one integer k
    // - we have to print th sum of every subarray of size k
    // input arr[1 40 30 10 20 5] , k=3
    // output = 80
    public static void main(String[] args) {
        int arr[] = { 1, 40, 30, 10, 20, 5 };
        int max = 0;
        int k = 3;
        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum = sum + arr[j];
            }
            if (max < sum) {
                max = sum;
            }
            System.out.println(max);
        }
    }
}
