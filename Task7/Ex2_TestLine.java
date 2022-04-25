import java.util.Arrays;
public class Ex2_TestLine {
    public static void main(String[] args) {
        Ex2_Line line1 = new Ex2_Line(1,2,3,4);
        System.out.println(line1);
        Ex2_Line line2 = new Ex2_Line(new Ex2_Point(5,6), new Ex2_Point(7,8));
        System.out.println(line2);

    line1.setBegin(new Ex2_Point(11,12));
    line1.setEnd(new Ex2_Point(13, 14));
        System.out.println(line1);
        System.out.println("begin is: "+line1.getBegin());
        System.out.println("end is: "+line1.getEnd());

        line1.setBeginX(21);
        line1.setBeginY(22);
        line1.setEndX(23);
        line1.setEndY(24);
        System.out.println(line1);

        System.out.println("begin's x is: "+line1.getBeginX());
        System.out.println("begin's y is: "+line1.getBeginY());
        System.out.println("end's x is: "+line1.getEndX());
        System.out.println("end's y is: "+line1.getEndY());

        line1.setBeginXY(31,32);
        line1.setEndXY(33,34);
        System.out.println(line1);
        System.out.println("begin's x and y are: "+Arrays.toString(line1.getBeginXY()));
        System.out.println("begin's x and y are: "+Arrays.toString(line1.getEndXY()));

        System.out.printf("length is: %.2f%n", line1.getLength());







    }


}
