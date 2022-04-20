public class Ex6_TestAc {
    public static void main(String[] args) {
        Ex6_Account b1 = new Ex6_Account("01","Nanh",1000);
        Ex6_Account b2 = new Ex6_Account("02", "Anh", 400);
        System.out.println(b1);
        System.out.println("transferTo: "+b1.transferTo(b2,100));
        System.out.println("Credit: "+b1.credit(200));
        System.out.println("Debit: "+b1.debit(250));
    }
}
