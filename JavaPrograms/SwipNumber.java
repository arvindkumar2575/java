public class SwipNumber {
    public static void main(String[] args) {
        int a=4,b=5;
        System.out.println("Numbers are a="+a+" & b="+b);
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Numbers are a="+a+" & b="+b);
    }
}
