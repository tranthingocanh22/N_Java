public class ClassRoom {
    public int classid;
    public String className;

    ClassRoom (int classid,String className){
        this.classid = classid;
        this.className = className;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classid=" + classid +
                ", className='" + className + '\'' +
                '}';
    }
    public static void main(String[] args) {
        ClassRoom test = new ClassRoom(2109, "T2109A");
        System.out.println(test);
        
    }
}
