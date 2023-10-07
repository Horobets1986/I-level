package horobets.hw1;

public class main2 {
    public static void main(String[] args) {

        int a, b;
        a = 5;
        b = 3;
        System.out.println(a);
        System.out.println(b);

        for (b = a; b-- == a;);
        System.out.println(a);

        for (a = b; a++ == b;);
        System.out.println(b);
    }
}


