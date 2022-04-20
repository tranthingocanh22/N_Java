public class Ex13_NewRectangle {
    private int width;
    private int height;

    private Ex13_NewRectangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    private Ex13_NewRectangle(int wid, int heig){
        System.out.println("Parameterized Constructor Invoked...");
        width=wid;
        height=heig;
    }
    public void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
