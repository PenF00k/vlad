package ru.penf00k.vlad.figures;

class Rectangle extends Figure {

    protected int width;
    protected int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double getArea() {
        return width * height;
    }
}
