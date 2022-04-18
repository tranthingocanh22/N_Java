public class Ex3_Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        Ex3_Customer objCustomer1 = new Ex3_Customer();
            objCustomer1.customerID =100;
            objCustomer1.customerName ="John";
            objCustomer1.customerAddress ="123Street";
            objCustomer1.customerAge =30;

        System.out.println("Customer Identification Number: "+objCustomer1.customerID);
        System.out.println("CustomerName: "+objCustomer1.customerName);
        System.out.println("CustomerAddress: "+objCustomer1.customerAddress);
        System.out.println("CustomerAge: "+objCustomer1.customerAge);
}
}
