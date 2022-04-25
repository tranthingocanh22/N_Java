public class Ex3_TestCircle {
    public static void main(String[] args) {
        Ex3_Circle c1 = new Ex3_Circle();
        System.out.println(c1);
        Ex3_Circle c2 = new Ex3_Circle(1,2,3.3);
        System.out.println(c2);
        Ex3_Circle c3 = new Ex3_Circle(new Ex2_Point(4,5),6.6);
        System.out.println(c3);

        c1.setCenter(new Ex2_Point(11,12));
        c1.setRadius(13.3);
        System.out.println(c1);
        System.out.println("center is: "+c1.getCenter());
        System.out.println("radius is: "+c1.getRadius());

        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("center's x is: "+c1.getCenterX());
        System.out.println("center's y is: "+c1.getCenterY());
        c1.setCenterXY(31,32);
        System.out.println(c1);
        System.out.println("center's x is: "+c1.getCenterXY()[0]);
        System.out.println("center's y is: "+c1.getCenterXY()[1]);

        System.out.printf("area is: %2f%n", c1.distance(c2));
        System.out.printf("area is: %2f%n", c2.distance(c1));

    }
}
