public class Task11 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int result = lcm(a, b);
        System.out.println("Output: LCM = " + result);
    }
}