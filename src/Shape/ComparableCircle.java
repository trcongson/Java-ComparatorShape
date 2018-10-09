package Shape;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(){}

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled){
        super(radius,color,filled);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle){
        if (getRadius() > comparableCircle.getRadius()){
            return 1;
        }else if (comparableCircle.getRadius() > getRadius()){
            return -1;
        }
        return 0;
    }
}
