public class Ex23_Varargs {
    public void addNumber(int...num){
        int sum=0;
        for (int i:num){
            sum = sum+i;
        }
        System.out.println("Sum of number is "+num);
    }

    public static void main(String[] args) {
        Ex23_Varargs obj = new Ex23_Varargs();
        obj.addNumber(10,30,20,40);
    }
}
