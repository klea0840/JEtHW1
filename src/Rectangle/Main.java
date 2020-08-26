package Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();

        Rectangle rec = new Rectangle();

        rec.setSide1(s1);
        rec.getSide1();

        rec.setSide2(s2);
        rec.getSide2();

        System.out.println("The area is " + rec.areaCalculator(s1, s2));
        System.out.println("The perimeter is " + rec.perimeterCalculator(s1, s2));

    }
}
