import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2)");
        System.out.print("X = ");
        int X = scan.nextInt();
        System.out.print("Y = ");
        int Y = scan.nextInt();
        System.out.print("Z = ");
        int Z = scan.nextInt();
        System.out.print("Q = ");
        if(X > Y && Y > Z && X > 0) {
            System.out.println("X^3 -Y - Z^2 = " + (X^3 - Y - Z^2));
        } else if(Y > X && X >= Z) {
            System.out.println("X^2 + Y*Z = " + (X^2 + Y * Z));
        } else if(Z >= Y && Y > X) {
            System.out.println("X * Y + Z^X = " + (X * Y + Z^X));
        } else {
            System.out.println("-X - Y - Z = " + (-X - Y - Z));
        }
        System.out.println("3)");
        System.out.print("Введіть рядок: ");
        scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.equals(s.toLowerCase())) {
            System.out.println("Hi");
        } else {
            System.out.println("Так");
        }
    }
}