public class NDivisibleDigits {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Program Usage: java NDivisibleDigits int1 int2");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int answer = nDivisibleDigits(n, m);
        System.out.println(answer == 0 ? "No solution." : answer);
    }
    private static int nDivisibleDigits(int n, int m) {
        int answer = (int)Math.pow(10, n) - 1;
        if (digitCount(answer) > digitCount(n)) {
            return 0;
        }
        while (answer % m != 0) {
            answer--;
        }
        return answer;
    }
    private static int digitCount(int num) {
        return digitCount(num, 0);
    }
    private static int digitCount(int num, int count) {
        if (num == 0) {
            return count;
        }
        return digitCount(num / 10, count + 1);
    }
}
