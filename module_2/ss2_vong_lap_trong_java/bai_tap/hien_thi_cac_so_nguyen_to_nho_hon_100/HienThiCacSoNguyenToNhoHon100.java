public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        HienThiCacSoNguyenToNhoHon100 primeChecker = new HienThiCacSoNguyenToNhoHon100();
        for (int i = 2; i <= 100; i++) {
            if (primeChecker.isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
