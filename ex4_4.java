import java.util.Scanner;
public class ex4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle radius : ");
        int r = input.nextInt();
        double area = r*r*3.14;
        System.out.println("Circle radius : "+area);
    }
}
