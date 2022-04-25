public class Ex2_Line {

    Ex2_Point begin, end;

    public Ex2_Line(int x1, int x2, int y1, int y2){
        begin = new Ex2_Point(x1,x2);
        end = new Ex2_Point(y1,y2);
    }

    public Ex2_Line( Ex2_Point begin, Ex2_Point end){
        this.begin = begin;
        this.end = end;
    }

    public Ex2_Point getBegin() {
        return begin;
    }

    public Ex2_Point getEnd() {
        return end;
    }

    public void setBegin(Ex2_Point begin) {
        this.begin = begin;
    }

    public void setEnd(Ex2_Point end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setX(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY (int y){
        end.setY(y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Ex2_Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
    public double getLength(){
        return begin.distance(end);
    }
}
