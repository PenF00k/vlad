package ru.penf00k.vlad.figures;

class Circle extends Figure {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return Math.PI * radius * radius;
    }

    static double getArea(int radius) {
        return Math.PI * radius * radius;
    }
}
