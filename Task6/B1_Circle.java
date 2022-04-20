public class B1_Circle {
        double radius;
        String color;

        public B1_Circle(){
                radius = 1;
                color = "red";
        }

        public B1_Circle(double r, String c){
                radius = r;
                color = c;
        }
        public double getRadius() {
                return radius;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setRadius(double radius) {
                this.radius = radius;
        }

        @Override
        public String toString() {
                return "B1_Circle{" +
                        "radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
        }
        public double getArea(){
                return radius*radius*Math.PI;
        }
}
