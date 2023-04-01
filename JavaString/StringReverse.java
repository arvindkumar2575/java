package JavaString;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Arvind Kumar";
        String reverse = "";
        System.out.println(name);
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            reverse=c+reverse;
        }
        System.out.println(reverse);
    }
}
