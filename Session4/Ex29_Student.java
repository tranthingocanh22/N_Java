public class Ex29_Student {
    int rollNo;
    String name;
    String address;
    float marks;
    public Ex29_Student(){
        rollNo = 0;
        name = "";
        marks = 0;
    }
    public Ex29_Student(int rNo, String sname){
        rollNo =rNo;
        name = sname;
    }
    public Ex29_Student(int rNo, float score){
        rollNo=rNo;
        marks=score;
    }
    public Ex29_Student(String sName, String addr){
        name = sName;
        address = addr;
    }
    public Ex29_Student(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks = score;
    }
    public void displayDetails(){
        System.out.println("Rollno :"+rollNo);
        System.out.println("Student name: "+name);
        System.out.println("Address "+address);
        System.out.println("Score "+marks);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Ex29_Student objStud1 = new Ex29_Student("David","302, Washington Street");
        objStud1.displayDetails();
        Ex29_Student objStud2 = new Ex29_Student(103,46);
        objStud2.displayDetails();
        Ex29_Student objStud3 = new Ex29_Student(104, "Roger",50);
        objStud3.displayDetails();
    }
}
