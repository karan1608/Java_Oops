abstract class temp1{
    abstract void rectangle(int a,int b);

    public void square(int a)
    {
        System.out.println("Area of Square:"+a*a);
    }
}

class temp3 extends temp1{
    public void rectangle(int a,int b)
    {
        System.out.println("Area of Rectangle:"+a*b);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        temp3 t3 = new temp3();
        t3.rectangle(10,20);
        t3.square(10);
    }

}
