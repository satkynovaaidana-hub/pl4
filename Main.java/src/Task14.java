public class Task14 {
    public static int transformDigits(int n) {
        String s = String.valueOf(n), res = "";
        for (char c : s.toCharArray()) {
            int d = c - '0';
            res += (d % 2 == 0) ? (d + 1) : (d - 1);
        }
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {
        System.out.println("Output: " + transformDigits(983210));
    }
}