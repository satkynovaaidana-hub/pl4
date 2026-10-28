public class Main {
    public static void main(int n, char symbol) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 7;
        main(n, '#');
    }
}