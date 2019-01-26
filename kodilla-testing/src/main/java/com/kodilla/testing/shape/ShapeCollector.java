package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {

    ArrayList<Shape> myShapes = new ArrayList<>();

    public void addFigure(Shape shape){
        myShapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if (myShapes.contains(shape)) {
            return myShapes.remove(shape);
        }else{
            return false;
        }
    }

    public Shape getFigure(int n){
        if (n>=0 && myShapes.size()>n) {
            return myShapes.get(n);
        }else {

            if(n<0) {
                System.out.println("Argument of this method must be non negative");
                return null;
            }else{
                System.out.println("There is no shape of indeks " + n );
                return null;
            }
        }
    }

    public ArrayList<Shape> showFigures(){
        return myShapes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(myShapes, that.myShapes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myShapes);
    }
}
