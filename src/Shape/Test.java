package Shape;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(20);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(30,"red",false);

        System.out.println("Pre-sorted");
        for (Circle circle: circles){
            System.out.println(circle);
        }
        System.out.println(circles[0].compareTo(circles[1]));
        Arrays.sort(circles);
        System.out.println("Sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
