// Written by Aidan Wiens, wiens056

// The Rectangle class creates rectangles to be used by the FractalDrawer class to draw fractals
// The Rectangle class is to be passed to the provided Canvas class for drawing

import java.awt.Color;

public class Rectangle {

    // variables

    private double xPos;
    private double yPos;
    private double width;
    private double height;
    private Color color;

    // Rectangle constructor

    public Rectangle(double x, double y, double w, double h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    // calculation methods

    public double calculatePerimeter() {
        return (width*2) + (height*2);
    }

    public double calculateArea() {
        return width*height;
    }

    // getter and setter methods

    public void setColor(Color c) {
        color = c;
    }

    public void setPos(double x, double y) {
        xPos = x;
        yPos = y;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
