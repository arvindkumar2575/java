package JavaString;

public class PrintStringNumberCombination {
    public static void main(String[] args) {
        String a = "Arvind";
        int i = 3,j=5;
        double d = 3.8,e=8;

        // if string comes first then all other variable in print statement treat as string
        System.out.println(a+i+j);

        // if interger comes first then all other variable in print statement treat as interger
        System.out.println(i+j+a);

        System.out.println(d+j+a);

        System.out.println(a+d+i);
    }
}
