import java.util.Scanner;
public class ex4_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = input.nextInt();
        System.out.println("Enter b :");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("a > b ");
        } 
        else if (a < b) {
            System.out.println("b > a ");
        } 
        else {
            System.out.println("a = b ");
        }
    }
}
