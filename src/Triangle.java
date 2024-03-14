// Written by Aidan Wiens, wiens056

// The Triangle class creates triangles to be used by the FractalDrawer class to draw fractals
// The Triangle class is to be passed to the provided Canvas class for drawing

import java.awt.Color;
import java.lang.Math;

public class Triangle {

    // variables

    private double xPos;
    private double yPos;
    private double width;
    private double height;
    private Color color;

    // Triangle constructor

    public Triangle(double x, double y, double w, double h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    // calculation methods

    public double calculatePerimeter() {
        double sides = Math.sqrt((width/2.0)*(width/2.0) + (height) * (height));
        return (sides*2) + width;
    }

    public double calculateArea() {
        return 0.5 * width * height;
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
