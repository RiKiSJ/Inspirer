import java.util.Scanner;

public class Math {

public static void main(String[] args) {
    int a;
    int b;
    int sum;

    Scanner in1 = new Scanner(System.in);
    System.out.println("Enter first number\n");
    a=in1.nextInt();

    Scanner in2 = new Scanner(System.in);
    System.out.println("Enter second number\n");
    b=in2.nextInt();

Sum Result = new Sum ();
Sum.Fun(a,b);
}
}
