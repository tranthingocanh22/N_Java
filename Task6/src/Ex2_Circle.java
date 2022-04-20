public class Ex2_Circle {
    double radius;

    public Ex2_Circle(){
        radius = 1.0;
    }

    public Ex2_Circle(double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Ex2_Circle{" +
                ",radius=" + radius +
                ",Area: " + getArea()+
                ",Circumference: " + getCircumference()+
                '}';
    }
}
