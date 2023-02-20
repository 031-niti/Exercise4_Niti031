import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;
public class ex4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter many Product ?");
        int n = input.nextInt();
        System.out.println("Enter Product price : ");
        float x = input.nextFloat();
        float Result = n*x;
        System.out.println("Price Total : "+Result);
    }
}
