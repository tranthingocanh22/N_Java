public class Ex1_1_TestAu {
    public static void main(String[] args) {
        //Test constructor and toString
        Ex1_1_Author author1 = new Ex1_1_Author("Ngoc Anh", "tranthingocanh2204@gmail.com", 'm');
        System.out.println(author1);

        //Test Setters and getters
        author1.setEmail("ngocanh2204@gmail.com");
        System.out.println(author1);
        System.out.println("Name is: "+ author1.getName());
        System.out.println("Gender is:" + author1.getGender());
        System.out.println("Email is: "+ author1.getEmail());
    }
}
