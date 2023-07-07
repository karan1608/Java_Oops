
class inhert1{
    int a;
    int b;
    public void rectangle(int a,int b)
    {
        System.out.println("Area of Rectangle:"+a*b);
    }
}
class inherit2 extends inhert1
{
  public void square(int a)
  {
      System.out.println("Area of Square:"+ a*a);
  }
}
public class inheritance extends inherit2 {
    public static void main(String[] args) {
        inherit2 i1 = new inherit2();
        i1.rectangle(1,2);
        i1.square(2 );
    }
}
