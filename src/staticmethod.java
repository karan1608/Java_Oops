public class staticmethod {

    static int a = 10;
    static int b = 20;

    public static void square() {

        System.out.println("Area of Rectangle:" + a * b);
    }

    public static void main(String[] args) {
        staticmethod.square();
    }
}
