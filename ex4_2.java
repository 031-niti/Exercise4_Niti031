import java.util.Scanner;
public class ex4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter many Product ?");
        int n = input.nextInt();
        double sum = 0;
        do {
            System.out.println("Enter Product price : ");
            double x = input.nextDouble();
            sum = sum + x;
            n = n-1;
        } while (n>1);
        System.out.println("sum = "+sum);
    }
}
