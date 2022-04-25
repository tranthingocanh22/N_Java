public class Ex1_2_Book {
    private String name;
    private Ex1_1_Author author;
    private double price;
    private int qty;

    public Ex1_2_Book(String name, Ex1_1_Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Ex1_1_Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "'" + name+"'" + " by "+author;
    }
}
