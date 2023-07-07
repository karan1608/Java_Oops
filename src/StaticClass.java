public class StaticClass {

    void rectangle()
    {
        System.out.println("I am rectangle");
    }

    public static class nested{

        static int a = 1;
        void square()
        {
            System.out.println("I am Square"+a);
        }

        static void square1()
        {
            System.out.println("Hello");
        }
    }
}
class main1{
    public static void main(String[] args) {
        StaticClass s2 = new StaticClass();
        StaticClass.nested s1 = new StaticClass.nested();
        s1.square();
        s2.rectangle();
        s1.square1();
    }
}
