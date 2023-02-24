import java.util.Scanner;
public class ex4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mid :");
        int a = input.nextInt();
        System.out.println("Enter final :");
        double b = input.nextDouble();
        double sum = a+b;
        if (sum >= 80) {
            System.out.println("Score " + sum + " , " + " A ");
        } else if (sum >= 75) {
            System.out.println("Score " + sum + " , " + " B+ ");
        } else if (sum >= 70) {
            System.out.println("Score " + sum + " , " + " B ");
        } else if (sum >= 65) {
            System.out.println("Score " + sum + " , " + " C+ ");
        } else if (sum >= 60) {
            System.out.println("Score " + sum + " , " + " C ");
        } else if (sum >= 55) {
            System.out.println("Score " + sum + " , " + " D+ ");
        } else if (sum >= 50) {
            System.out.println("Score " + sum + " , " + " D ");
        } else {
            System.out.println("Score " + sum + " , " + " E ");
        }

    }
}
