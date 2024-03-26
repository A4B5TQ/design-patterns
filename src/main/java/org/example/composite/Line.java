package org.example.composite;

public class Line implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Line with color: " + fillColor);
    }
}
