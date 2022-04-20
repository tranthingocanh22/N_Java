public class Product {
    String name;
    float price;
    int qty;
    int id;

    public Product(String Name,float Price,int Qty,int Id) {
    name = Name;
    price = Price;
    qty = Qty;
    id = Id;
    }

    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public int getId(){
        return id;
    }
}
