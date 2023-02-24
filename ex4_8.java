public class ex4_8 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        do {
            System.out.println("Sum = " +sum );
            sum = sum + n;
            System.out.println("n = " + n);
            n = n + 1;
        } while (n <= 10);
        System.out.println("Toal : " +sum);

        sum = 0;
        for(int i=1; i<=1; i=i+1 ){
            sum = sum + 1;
        }
        System.out.println("Toal : " + sum);
    }
}
