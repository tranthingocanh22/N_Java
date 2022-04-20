import java.awt.*;

public class Ex10_Rectangle {
    int width;
    int height;

    Ex10_Rectangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    Ex10_Rectangle(int wid, int heig){
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
