package org.example.composite;

public class Rectangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing rectangle with color: " + fillColor);
    }
}
