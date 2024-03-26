package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> leafs = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape leaf : this.leafs) {
            leaf.draw(fillColor);
        }
    }

    public void add(Shape shape) {
        this.leafs.add(shape);
    }

    public void remove(Shape shape) {
        this.leafs.remove(shape);
    }

    public void clear() {
        this.leafs.clear();
        System.out.println("Clearing all the shapes from drawing");
    }
}
