public class Task8 {
    public static String decimalToBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println("Binary = " + decimalToBinary(n));
    }
}