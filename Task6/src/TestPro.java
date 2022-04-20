public class TestPro {
    public static void main(String[] args) {
        Product A1 = new Product("Rice",50, 10, 01);
        System.out.println("Name: "+A1.name);
        System.out.println("Price: "+A1.price);
        System.out.println("Qty: "+A1.qty);
        System.out.println("Id: "+A1.id);

        Product b1 = new Product("Milk",60, 20, 02);
        System.out.println("Name: "+b1.name);
        System.out.println("Price: "+b1.price);
        System.out.println("Qty: "+b1.qty);
        System.out.println("Id: "+b1.id);
    }
}
