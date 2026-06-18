class PrintNumber {
    static void printNto1(int n) {
        if (n == 0) return;   // base case
        System.out.print(n + " ");
        printNto1(n - 1);     // recursive call
    }

    public static void main(String[] args) {
        printNto1(5);
    }
}
