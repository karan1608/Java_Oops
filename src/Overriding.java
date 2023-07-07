class Overriding1 {
    void rectangle(int a,int b)
    {
        int result = a*b;
        System.out.println("Area of rectangle:"+result);
    }
}
class derived1 extends Overriding1{
    void rectangle(int a,int b)
    {
        super.rectangle(a,b);
        int result = (int) ((0.5)*a*b);
        System.out.println("Perimeter of rectangle: "+result);

    }
}
public class Overriding{
    public static void main(String[] args) {
        derived1 dd = new derived1();
        dd.rectangle(12,25);
    }
}
