public class Ex5_TestInvo {
    public static void main(String[] args) {
        Ex5_InvoiceItem b1 = new Ex5_InvoiceItem("T1","Rice",10,50);
        System.out.println("id='" + b1.id + '\'' +
                ", desc='" + b1.desc + '\'' +
                ", qty=" + b1.qty +
                ", uniPrice=" + b1.uniPrice + '\'' +
                ",Total=" + b1.getTotal());

        Ex5_InvoiceItem b2 = new Ex5_InvoiceItem("T2","Candy",5,70);
        b2.setQty(6);
        b2.setUniPrice(20000);
        System.out.println("id='" + b2.id + '\'' +
                ", desc='" + b2.desc + '\'' +
                ", qty=" + b2.qty +
                ", uniPrice=" + b2.uniPrice + '\'' +
                ",Total=" + b2.getTotal());
    }
}
