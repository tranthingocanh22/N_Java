public class Ex3_Circle {
     Ex2_Point center;
     double radius;

    private Ex3_Circle(){
        this.center = new Ex2_Point();
        this.radius = 1.0;
    }

    public Ex3_Circle(int xCenter, int yCenter, double radius){
        center = new Ex2_Point(xCenter,yCenter);
        this.radius = radius;
    }

    public Ex3_Circle(Ex2_Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Ex2_Point getCenter() {
        return center;
    }

    public void setCenter(Ex2_Point center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setX(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x,int y){
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Ex3_Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return 2.0 * Math.PI * radius;
    }

    public double distance(Ex3_Circle another){
        return center.distance(another.center);
    }

}
