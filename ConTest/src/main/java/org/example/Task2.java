import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int K = scanner.nextInt();
        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = scanner.nextInt();
        }

        int left = 0;
        int right = stalls[n - 1] - stalls[0];
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceCows(stalls, K, mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean canPlaceCows(int[] stalls, int K, int D) {
        int count = 1;
        int lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= D) {
                count++;
                lastPos = stalls[i];
                if (count == K) {
                    return true;
                }
            }
        }
        return false;
    }
}
