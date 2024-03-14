// Written by Aidan Wiens, wiens056

// The FractalDrawer class uses shape classes and the Canvas class to draw a fractal using recursion and give the area of the fractal

import java.awt.Color;
import java.util.Scanner;
import java.lang.Math;

public class FractalDrawer {

    // member variable for tracking the total area

    private double totalArea=0;

    // constructor

    public FractalDrawer() {}

    // public methods

    public double drawFractal(String type) {
        if (type.equals("circle")) {
            Canvas drawing = new Canvas(1200, 1200);
            drawCircleFractal(100,600, 450, Color.BLUE, drawing, 7);
            return totalArea;
        }
        else if (type.equals("rectangle")) {
            Canvas drawing = new Canvas(1200, 1200);
            drawRectangleFractal(170,170, 500, 350, Color.BLUE, drawing, 7);
            return totalArea;
        }
        else if (type.equals("triangle")) {
            Canvas drawing = new Canvas(1200, 1200);
            drawTriangleFractal(170, 170, 500, 550, Color.BLUE, drawing, 7);
            return totalArea;
        }
        else {
            System.out.println("Invalid shape entered.");
            return -1;
        }
    }

    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level > 0) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            Color c1 = new Color(r,g,b);
            Triangle myTriangle = new Triangle(x, y, width, height);
            totalArea += myTriangle.calculateArea();
            myTriangle.setColor(c);
            can.drawShape(myTriangle);
            drawTriangleFractal(width/2.0, height/2.0, x + width/4.0, y - height, c1, can, level - 1);
            drawTriangleFractal(width/2.0, height/2.0, x - width/2.0, y, c1, can, level - 1);
            drawTriangleFractal(width/2.0, height/2.0, x + width, y, c1, can, level - 1);
        }
    }

    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level > 0) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            Color c1 = new Color(r,g,b);
            Circle myCircle = new Circle(x, y, radius);
            totalArea += myCircle.calculateArea();
            myCircle.setColor(c);
            can.drawShape(myCircle);
            drawCircleFractal(radius/2.0, x, y + radius + radius/2.0, c1, can, level - 1);
            drawCircleFractal(radius/2.0, x - radius - radius/2.0, y, c1, can, level - 1);
            drawCircleFractal(radius/2.0, x + radius + radius/2.0, y, c1, can, level - 1);
            drawCircleFractal(radius/2.0, x, y - radius - radius/2.0, c1, can, level - 1);
        }
    }

    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level > 0) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            Color c1 = new Color(r,g,b);
            Rectangle myRectangle = new Rectangle(x, y, width, height);
            totalArea += myRectangle.calculateArea();
            myRectangle.setColor(c);
            can.drawShape(myRectangle);
            drawRectangleFractal(width/2.0, height/2.0, x - width/2.0, y - height/2.0, c1, can, level - 1);
            drawRectangleFractal(width/2.0, height/2.0, x - width/2.0, y + height, c1, can, level - 1);
            drawRectangleFractal(width/2.0, height/2.0, x + width, y - height/2.0, c1, can, level - 1);
            drawRectangleFractal(width/2.0, height/2.0, x + width, y + height, c1, can, level - 1);
        }
    }

    public static void main(String[] args){
        System.out.println("What shape would you like: circle, rectangle, or triangle?");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        FractalDrawer myDrawer = new FractalDrawer();
        System.out.println("Area of fractal:" + myDrawer.drawFractal(input));
    }
}

