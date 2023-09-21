package GroupProject2;

class Circle implements Shape{
    private double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }
}
