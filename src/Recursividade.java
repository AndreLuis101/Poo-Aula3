public class Recursividade {
    public static void main(String[] args) {
        int n = 5;
        int fatorial = fatorial(n);
        System.out.printf("O fatorial de %d é %d\n", n, fatorial);
    }
    
    public static int fatorial(int n) {
    if (n == 0) {
        return 1;
    } else {
    return n * fatorial(n - 1);
        }
    }
}