public class Overloading {
    void method(int i) {
        System.out.println("int Version ");
    }

    void method(String s) {
        System.out.println("String Version ");
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        char ch = 'c';
        obj.method(ch);
    }
}
