import java.util.Scanner;
public class ex4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x :");
        int x = input.nextInt();
        double y = (x*x)+(2*x)+10;
        System.out.println("Y = " +y);
    }
}
