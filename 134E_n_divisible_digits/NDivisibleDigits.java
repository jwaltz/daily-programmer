public class NDivisibleDigits {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Program Usage: java NDivisibleDigits int1 int2");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        System.out.println(getAnswer(n, m));
    }
    private static int getAnswer(int n, int m) {
        int answer = (int)Math.pow(10, n) - 1;
        while (answer % m != 0) {
            answer--;
        }
        return answer;
    }
}