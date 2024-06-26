public class Fibo {
    public static int Fibo(int n) {
        if (n == 0) return 1;
        else if (n == 1) return 1;
        else if (n >= 2) return Fibo(n - 1) + Fibo(n - 2);
        else return -1;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("F(" + i + ") = " + Fibo(i));
        }
    }
}
