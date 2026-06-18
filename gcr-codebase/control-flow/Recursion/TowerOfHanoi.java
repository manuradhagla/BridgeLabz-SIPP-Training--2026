class TowerOfHanoi {
    static void solve(int n, char source, char helper, char dest) {
        if (n == 0) return;
        solve(n-1, source, dest, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        solve(n-1, helper, source, dest);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'B', 'C');
    }
}
