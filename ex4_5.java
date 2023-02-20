import java.util.Scanner;
public class ex4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width : ");
        int w = input.nextInt();    
        System.out.println("Enter length : ");
        double l = input.nextDouble();
        
        double area = w*l;
        System.out.println("Square area : "+area);

    }
}
