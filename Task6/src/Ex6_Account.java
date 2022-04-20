public class Ex6_Account {
    String id;
    String name;
    int balance;

    public Ex6_Account(String id, String name){
        this.id = id;
        this.name = name;
        balance = 0;
    }
    public Ex6_Account(String id, String name, int balance ){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() { return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit (int amount){
        balance+=amount;
        return balance;
    }
     public int debit(int amount){
        if(amount<=balance) {
        balance = balance - amount;
        return balance;
        }
        else {
            System.out.println("amount exceeded");
            return balance;
        }
     }
     public int transferTo(Ex6_Account another, int amount) {
         if (amount <= balance) {
            balance = balance - amount;
             another.balance+= amount;
         }
         else{
             System.out.println("amount exceeded");
         }
         return balance;
     }

    @Override
    public String toString() {
        return "Ex6_Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
