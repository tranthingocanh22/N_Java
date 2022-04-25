public class Ex1_2_TestBook {
    public static void main(String[] args) {
        Ex1_1_Author author1 = new Ex1_1_Author( "Tran Ngoc Anh", "tranthingocanh2204@gmail.com", 'm');
        System.out.println(author1);

        //Test book constructor and toString()
        Ex1_2_Book book1 = new Ex1_2_Book("Java", author1,100, 10);
        System.out.println(book1);

        book1.setPrice(200);
        book1.setQty(20);
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("author's name is: " +book1.getAuthor().getName());
        System.out.println("author's email is: " + book1.getAuthor().getEmail());
        System.out.println("author's gender is: " + book1.getAuthor().getGender());

        Ex1_2_Book book2 = new Ex1_2_Book("Java for more dummies", new Ex1_1_Author("ABC","ABC22@gmail.com",'m'),300,30);
        System.out.println(book2);
        }
    }

