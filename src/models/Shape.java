package models;

import helpers.Calculation;
import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    ArrayList<Point> Points = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        Points.add(point);
    }

    // calculatePerimeter()
    public double getPerimeter(){
        return Calculation.getSum(getSides());
    }


    // getAverageSide()
    public double getAverageSide(){
        return Calculation.getAvg(getSides());
    }

    // getLongestSide()
    public double getLongestSide(){
        return Calculation.getMax(getSides());
    }

    private double[] getSides(){
        int n =Points.size();
        double[] sides=new double[n];
        for (int i=0;i<n;i++){
            Point currenPoint=Points.get(i);
            Point nextPoint = Points.get((i+1)%n);
            sides[i]=currenPoint.Distance(nextPoint);
        }
        return sides;

    }
}
