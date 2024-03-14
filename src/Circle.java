// Written by Aidan Wiens, wiens056

// The Circle class creates circles to be used by the FractalDrawer class to draw fractals
// The Circle class is to be passed to the provided Canvas class for drawing

import java.awt.Color;
import java.lang.Math;

public class Circle {

    // variables

    private double xPos;
    private double yPos;
    private double radius;
    private Color color;

    // Circle constructor

    public Circle(double x, double y, double rad) {
        xPos = x;
        yPos = y;
        radius = rad;
    }

    // calculation methods

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    // getter and setter methods

    public void setColor(Color c) {
        color = c;
    }

    public void setPos(double x, double y) {
        xPos = x;
        yPos = y;
    }

    public void setRadius(double r) {
        radius = r;
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

    public double getRadius() {
        return radius;
    }
}
