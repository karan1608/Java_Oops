interface temp{
    abstract void rectangle();
    abstract void square(int a);
}
interface temp4
{
    abstract void rectangle();
}
class temp2 implements temp,temp4{

    @Override
    public void rectangle() {
        System.out.println("Area of rectangle");
    }

    @Override
    public void square(int a) {
        System.out.println("Area of Square:"+a*a);
    }
}

public class interface1 {
    public static void main(String[] args) {
        temp2 t1 = new temp2();
        t1.rectangle();
        t1.square(2);
    }
}
