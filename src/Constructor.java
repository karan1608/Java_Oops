class Constructor1 {
    int a;
    int b;
    int c;
    Constructor1(){
        System.out.println("Hello");
    }
    Constructor1(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    Constructor1(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int rectangle()
    {

        return a*b;
    }

    int   multiply()
    {
        return a*b*c;
    }
}
public class Constructor
{
    public static void main(String[] args) {
        //Constructor1 c = new Constructor1();
        Constructor1 c1 = new Constructor1(10,20,30);
        System.out.println("Area of Rectangle: "+ c1.multiply());
    }
};
