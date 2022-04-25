public class Student {
    int RollNo;
    String name;
    ClassRoom myclass;

    Student(int RollNo, String name){
        this.RollNo = RollNo;
        this.name = name;
    }

    Student(int RollNo, String name, ClassRoom myclass){
        this.RollNo = RollNo;
        this.name = name;
        this.myclass = myclass;
    }

    public int getRollNo() {
        return RollNo;
    }

    public String getName() {
        return name;
    }

    public ClassRoom getMyclass() {
        return myclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", name='" + name + '\'' +
                ", myclass=" + myclass +
                '}';
    }

    public static void main(String[] args) {
        ClassRoom cl1 = new ClassRoom(1,"T2109A");
        Student testStu = new Student(22,"Nanh",cl1);
        System.out.println(testStu);
    }
}
