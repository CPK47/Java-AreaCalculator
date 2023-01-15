import java.awt.geom.Area;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        System.out.println(AreaCalculator.Area(5.0));
        System.out.println(AreaCalculator.Area(-1.0));
        System.out.println(AreaCalculator.Area(5.0, 4.0));
        System.out.println(AreaCalculator.Area(-1.0, 4.0));
    }

    public static class AreaCalculator
    {
        public static double Area(double radius)
        {
            if(radius < 0) return -1.0;
            else
            {
                return radius * radius * Math.PI;
            }
        }

        public static double Area(double x, double y)
        {
            if(x < 0 || y < 0) return -1.0;
            return x * y;
        }
    }
}